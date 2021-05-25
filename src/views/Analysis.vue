<template>
  <div>
    <el-container style="height:500px;width:1420px;margin-top: 20px;border-bottom-left-radius: 20px;border-bottom-right-radius: 20px;
    margin-right: 50px;border-top-left-radius: 20px;border-top-right-radius: 20px;
    background-color:white;border: 2px solid #eee;" >
      <el-table
          :data="tableData.filter(data => !search || data.name.toLowerCase().includes(search.toLowerCase()))"
          style="width: 100%;margin-left: 20px">
        <el-table-column
            label="Date"
            prop="date">
        </el-table-column>
        <el-table-column
            label="Name"
            prop="name">
        </el-table-column>
        <el-table-column
            align="right">
          <template slot="header" slot-scope="scope">
            <el-input
                v-model="search"
                size="mini"
                placeholder="输入关键字搜索"/>
          </template>
          <template slot-scope="scope">
            <el-button
                size="mini"
                @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
            <el-button
                size="mini"
                type="danger"
                @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
          </template>
        </el-table-column>
      </el-table>

    </el-container>
  </div>
</template>

<script>
export default {
  name: "Analysis",
  data() {
    return {
      tableData: [{
        date: '2016-05-02',
        name: '第一章 简单java编程',
        address: '2016-05-22'
      }, {
        date: '2016-05-04',
        name: '第二章 UML-类图',
        address: '2016-05-24'
      }, {
        date: '2016-05-01',
        name: '第三章 面向对象原则重构',
        address: '2016-05-26'
      }, {
        date: '2016-05-03',
        name: '第四章 工厂方法模式',
        address: '2016-06-14'
      }]
    }
  },
  methods: {
    handleEdit(index, row) {
      console.log(index, row);
    },
    handleDelete(index, row) {
      console.log(index, row);
    }
  },
}
</script>

<style scoped>

</style>