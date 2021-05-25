<template>
  <el-container>
    <el-header class="home-header">
      <div class="title">课程管理系统</div>
      <div class="user-info">
        <el-dropdown>
          <el-button type="info" icon="el-icon-user">
            user<i class="el-icon-arrow-down el-icon--right"></i>
          </el-button>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>黄金糕</el-dropdown-item>
            <el-dropdown-item>狮子头</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </div>
    </el-header>
    <el-tabs style="margin-left: 60px;width: 1400px" type="border-card">
      <el-tab-pane label="我的课堂">
        <el-container>
          <el-card class="box-card" style="margin-top: 20px;margin-left: 60px">
              <div slot="header">
                <span>大一上学期选课</span>
              </div>
              <div>
                <img src="../assets/pc1.jpg" class="image">
                <el-table :data="yishangs">
                  <el-table-column type="expand">
                    <template slot-scope="scope">
                    <el-form inline>
                    <el-form-item label="课程简介"  class="aaa">
                      <span>{{ scope.row.intro }}</span>
                    </el-form-item>
                      <el-form-item label="学分" class="aaa">
                        <span>{{ scope.row.score }}</span>
                      </el-form-item>
                    </el-form>
                    </template>
                  </el-table-column>
                  <el-table-column prop="uid" label="课程号" width="120">
                  </el-table-column>
                  <el-table-column prop="name" label="课程" width="120">
                  </el-table-column>
                  <el-table-column prop="teacher" label="任课教师" width="120">
                  </el-table-column>
                  <el-table-column label="课程内容" width="120" align="left">
                      <el-button size="mini" type="info" @click="toDetail">详细信息</el-button>
                  </el-table-column>
                </el-table>
              </div>
          </el-card>
          <el-card class="box-card" style="margin-top: 20px;margin-left: 100px">
            <div slot="header">
              <span>大一上学期选课</span>
            </div>
            <div>
              <img src="../assets/logo.png" class="image">
              <el-table :data="yixias">
                <el-table-column type="expand">
                  <template slot-scope="scope">
                    <el-form inline>
                      <el-form-item label="课程简介"  class="aaa">
                        <span>{{ scope.row.intro }}</span>
                      </el-form-item>
                      <el-form-item label="学分" class="aaa">
                        <span>{{ scope.row.score }}</span>
                      </el-form-item>
                    </el-form>
                  </template>
                </el-table-column>
                <el-table-column prop="uid" label="课程号" width="120">
                </el-table-column>
                <el-table-column prop="name" label="课程" width="120">
                </el-table-column>
                <el-table-column prop="teacher" label="任课教师" width="120">
                </el-table-column>
                <el-table-column label="课程内容" width="120" align="left">
                  <el-button size="mini" type="info">详细信息</el-button>
                </el-table-column>
              </el-table>
            </div>
          </el-card>
        </el-container>
        <el-container>
          <el-card class="box-card" style="margin-top: 20px;margin-left: 60px">
            <div slot="header">
              <span>大二上学期选课</span>
            </div>
            <div>
              <img src="../assets/logo.png" class="image">
              <el-table :data="ershangs">
                <el-table-column type="expand">
                  <template slot-scope="scope">
                    <el-form inline>
                      <el-form-item label="课程简介"  class="aaa">
                        <span>{{ scope.row.intro }}</span>
                      </el-form-item>
                      <el-form-item label="学分" class="aaa">
                        <span>{{ scope.row.score }}</span>
                      </el-form-item>
                    </el-form>
                  </template>
                </el-table-column>
                <el-table-column prop="uid" label="课程号" width="120">
                </el-table-column>
                <el-table-column prop="name" label="课程" width="120">
                </el-table-column>
                <el-table-column prop="teacher" label="任课教师" width="120">
                </el-table-column>
                <el-table-column label="课程内容" width="120" align="left">
                  <el-button size="mini" type="info">详细信息</el-button>
                </el-table-column>
              </el-table>
            </div>
          </el-card>
        </el-container>
      </el-tab-pane>
      <el-tab-pane label="课堂管理" >
        <el-collapse accordion style="margin-left:50px;margin-top: 60px;box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);width: 1200px">
          <el-collapse-item title="大一上学期" name="first" style="margin-left: 20px">
            <el-card shadow="always">
              <el-main>
                <el-container>
                  <el-header>
                    <el-row>
                      <router-link to="/yishang">
                        <el-button  type="primary" icon="el-icon-s-opportunity">我选的</el-button>
                      </router-link>
                    </el-row>
                  </el-header>
                  <div><router-view></router-view></div>
                </el-container>
              </el-main>
            </el-card>
          </el-collapse-item>
          <el-collapse-item title="大一下学期" name="second" style="margin-left: 20px">
            <el-card shadow="always">
              <el-main>
                <el-container>
                  <el-header>
                    <el-row>
                      <router-link to="/yixia">
                        <el-button  type="primary" icon="el-icon-s-opportunity">我选的</el-button>
                      </router-link>
                    </el-row>
                  </el-header>
                  <div><router-view></router-view></div>
                </el-container>
              </el-main>
            </el-card>
          </el-collapse-item>
          <el-collapse-item title="大二上学期" name="third" style="margin-left: 20px">
            <el-card shadow="always">
              <el-main>
                <el-container>
                  <el-header>
                    <el-row>
                      <router-link to="/ershang">
                        <el-button  type="primary" icon="el-icon-s-opportunity">我选的</el-button>
                      </router-link>
                    </el-row>
                  </el-header>
                  <div><router-view></router-view></div>
                </el-container>
              </el-main>
            </el-card>
          </el-collapse-item>
          <el-collapse-item title="大二下学期" name="forth" style="margin-left: 20px">
            <el-card shadow="always">
              <el-main>
                <el-container>
                  <el-header>
                    <el-row>
                      <router-link to="/student">
                        <el-button  type="primary" icon="el-icon-s-opportunity">我选的</el-button>
                      </router-link>
                    </el-row>
                  </el-header>
                  <div><router-view></router-view></div>
                </el-container>
              </el-main>
            </el-card>
          </el-collapse-item>
        </el-collapse>
      </el-tab-pane>
      <el-tab-pane label="关于我们" class="about">项目负责人：陶智剑、张坤、邱煜辉
        <div>联系方式:xxxxxxxx@qq.com</div></el-tab-pane>
    </el-tabs>
  </el-container>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'Home',
  components: {
  },
  data () {
    return {
      msg: '',
      yishangs:[],
      yixias:[],
      ershangs:[],
    }
  },
  created() {
    this.findAllYishangs();
    this.findAllYixias();
    this.findAllErshangs();
  },
  methods: {
    findAllYishangs () {
      this.$axios.get("/yishang/findAllYishangs")
          .then((res) => {
            this.yishangs = res.data
          })
          .catch(error => {
            this.$message({
              type: 'error',
              message: "查询失败，原因是"+error.data.message
            });
          });
    },
    findAllYixias () {
      this.$axios.get("/yixia/findAllYixias")
          .then((res) => {
            this.yixias = res.data
          })
          .catch(error => {
            this.$message({
              type: 'error',
              message: "查询失败，原因是"+error.data.message
            });
          });
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
    toDetail(){
      this.$router.push('/detail')
    }
  }
}
</script>

<style>
.home-header {
  background-color: cornflowerblue;
  line-height: 60px;
  display: flex;
}
.home-header .title {
  font-size: 30px;
  font-family: 华文楷书;
  color: #505458;
  margin:0 auto;
}
.user-info {
  cursor: pointer;
}
.about{
  font-size: 30px;
  font-family: 华文隶书;
}
.aaa label{
  font-family: 华文楷书;
  font-size: 20px;
}
.image{
  width: 100%;
  display: block;
}
</style>