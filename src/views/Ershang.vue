<template >
  <div>
    <div style="margin-top:50px;">
      <el-input v-model="ershangName" placeholder="请输入课程名" style="width:80%" clearable></el-input>
      <el-button type="primary" style="margin-left: 10px;" @click="searchErshangByName">搜索</el-button>
      <el-button type="primary" style="margin-left:10px;margin-bottom: 20px;" @click="showDialog">加课</el-button>
    </div>
    <div>
      <el-table
          :data="ershangs"
          border>
        <el-table-column
            prop="uid"
            label="课程号"
            width="180">
        </el-table-column>
        <el-table-column
            prop="name"
            label="课程"
            width="180">
        </el-table-column>
        <el-table-column
            prop="teacher"
            label="任课教师"
            width="180">
        </el-table-column>
        <el-table-column
            prop="score"
            label="学分"
            width="180">
        </el-table-column>
        <el-table-column
            label="操作">
          align="left">
          <template slot-scope="scope">
            <el-button
                size="mini" @click="handleEdit(scope.row)">修改</el-button>
            <el-button
                size="mini"
                type="danger"
                @click="handleDelete(scope.row)">退课</el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>
    <el-dialog :title="dialogTitle[dialogStatus]" :visible.sync="dialogFormVisible" center>
      <el-form :model="form" :rules="rules" ref="ershang">
        <el-form-item label="课程名" :label-width="formLabelWidth" prop="name">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="任课教师" :label-width="formLabelWidth" prop="teacher">
          <el-input v-model="form.teacher" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="成绩" :label-width="formLabelWidth" prop="score">
          <el-input v-model="form.score" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="课程简介" :label-width="formLabelWidth" prop="intro" >
          <el-input v-model="form.intro" autocomplete="off"  type="textarea" autosize></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitErshangs">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'Home',
  components: {
  },
  data () {
    return {
      ershangName: '',
      dialogStatus: "",
      dialogTitle: {
        addErshang: "选课",
        editErshang: "编辑课程"
      },
      rules: {
        name: [
          { required: true, message: '请输入姓名', trigger: 'blur' }
        ],
        teacher: [
          { required: true, message: '请输入姓名', trigger: 'blur' }
        ],
        score: [
          { required: true, message: '请输入姓名', trigger: 'blur' }
        ],
        intro: [
          { required: true, message: '请输入姓名', trigger: 'blur' }
        ]
      },
      msg: '',
      ershangs:[],
      search: '',
      dialogFormVisible: false,
      form: {
        uid:'',
        name: '',
        score: '',
        teacher: '',
        intro:''
      },
      formLabelWidth: '120px',
    }
  },
  created() {
    this.findAllErshangs();
  },
  watch:{
    ershangName () {
      this.findAllErshangs();
    }
  },
  methods: {
    searchErshangByName () {
      if (this.ershangName !== '') {
        this.$axios.get("/ershang/findErshangByName?name="+this.ershangName).then( (resp)=> {
          this.ershangs = resp.data;
        }).catch( (error)=>{
          this.$message({
            type: 'error',
            message: "查询失败，原因是"+error.data.message
          });
        })
      }
    },
    submitErshangs () {
      if (this.dialogStatus === 'addErshang'){
        this.addErshang();
      } else if(this.dialogStatus === "editErshang") {
        this.editErshang();
      }
    },
    findAllErshangs () {
      this.$axios.get("/ershang/findAllErshangs")
          .then((res) => {
            this.ershangs = res.data
          })
          .catch(error => {
            this.$message({
              type: 'error',
              message: "查询失败，原因是"+error.data.message
            });
          });
    },
    handleEdit (row) {
      this.dialogFormVisible = true;
      this.dialogStatus = "editErshang";
      this.form.uid = row.uid;
      this.form.name = row.name;
      this.form.teacher = row.teacher;
      this.form.score = row.score;
      this.form.intro = row.intro;
    },
    handleDelete (row) {
      this.$confirm('此操作将退订该课程, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.post("/ershang/deleteErshang?uid="+row.uid).then ((resp)=>{
          this.$message.success("删除成功!")
          this.findAllErshangs();
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });
    },
    showDialog () {
      this.form.uid = '';
      this.form.name = '';
      this.form.score = '';
      this.form.teacher = '';
      this.form.intro = '';
      this.dialogFormVisible = true;
      this.dialogStatus = "addErshang";
    },
    addErshang () {
      this.$refs.ershang.validate((valid) => {
        if (valid) {
          this.$axios.post("/ershang/addErshang",this.form).then( (resp)=>{
            if (resp) {
              this.dialogFormVisible = false;
              this.$message.success("添加成功！");
              this.findAllErshangs();
            }
          }).catch((error)=>{
            this.$message({
              message: '添加数据失败，原因是'+error.data.message,
              type: 'error'
            })
          })
        } else {
          this.$message({
            message: '请输入所有字段',
            type: 'error'
          })
          return false;
        }
      });
    },
    editErshang () {
      this.$axios.post("/ershang/updateErshang",this.form).then( (resp)=>{
        this.dialogFormVisible = false;
        this.$message.success("修改成功!");
        this.findAllErshangs();
      }).catch( (error)=> {
        this.$message({
          message: '数据更新失败，原因是'+error.data.message,
          type: 'error'
        })
      })
    },
  }
}
</script>
<style scoped>
.table {
  margin: 0 auto;
  clear: both;
}
</style>