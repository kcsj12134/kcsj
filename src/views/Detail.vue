<template>
  <div>
    <el-container style="height: 100px; position:relative;border: 1px solid #eee">
      <el-container class="导航" style="height:100px;background-color: rgb(238, 241, 246);border: 2px solid #eee">
        <el-button @click="drawer = true" style="margin-left: 16px;">
          <i class="el-icon-s-order"></i>
        </el-button>
        <el-drawer
            title="我是标题"
            :visible.sync="drawer"
            :direction="direction"
            :before-close="handleClose"
            :with-header="false">
          <span style="margin-left: 200px;font-size: 35px">课堂派</span>
          <el-row class="tac" style="width: 2000px">
            <el-col :span="12">
              <el-menu>
                <el-submenu index="1">
                  <template slot="title">
                    <i class="el-icon-s-management"></i>
                    <span>我的课堂</span>
                  </template>
                </el-submenu>
                <el-menu-item index="2">
                  <i class="el-icon-edit-outline"></i>
                  <span slot="title">备课区</span>
                </el-menu-item>
                <el-menu-item index="3" >
                  <i class="el-icon-document"></i>
                  <span slot="title">论文管理</span>
                </el-menu-item>
              </el-menu>
            </el-col>
          </el-row>


        </el-drawer>
        <el-breadcrumb separator-class="el-icon-arrow-right" style="text-align: right; font-size:35px;margin-top: 15px;margin-left: 20px">
          <el-breadcrumb-item style="text-align: right; font-size:20px;margin-top:25px":to="{ path: '/Home' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item style="text-align: right; font-size:20px;margin-top:25px">课程内容</el-breadcrumb-item>
        </el-breadcrumb>
        <el-button style="text-align: right; font-size:12px;margin-top:0px;margin-left: 800px"><i class="el-icon-sort">切换旧版本</i></el-button>
        <el-button style="text-align: right; font-size:20px;margin-top:0px;margin-left: 20px" ><i class="el-icon-document"></i></el-button>
        <el-dropdown style="text-align: right; font-size:35px;margin-top: 15px;margin-left: 20px">
          <el-button  >
            <i class="el-icon-message-solid"></i>
          </el-button>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>黄金糕</el-dropdown-item>
            <el-dropdown-item>狮子头</el-dropdown-item>
            <el-dropdown-item>螺蛳粉</el-dropdown-item>
            <el-dropdown-item>双皮奶</el-dropdown-item>
            <el-dropdown-item>蚵仔煎</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
        <el-dropdown style="text-align: right; font-size:20px;margin-top:25px;margin-left: 20px"  >
          <i class="el-icon-setting" style="text-align: right; font-size:20px;margin-top:13px"></i>
          <el-dropdown-menu slot="dropdown" >
            <el-dropdown-item>退出</el-dropdown-item>
            <el-dropdown-item>删除</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
        <el-avatar src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png" style="margin-top: 25px"></el-avatar>
      </el-container>
    </el-container>
    <el-container style="height:280px;margin-top: 20px;border-bottom-left-radius: 20px;border-bottom-right-radius: 20px;
    margin-left: 50px;margin-right: 50px;border-top-left-radius: 20px;border-top-right-radius: 20px;
    background-color: rgb(238, 241, 246);border: 2px solid #eee;" >
      <el-container>
        <el-header class="backimage" style="height: 200px;border-top-left-radius: 20px;border-top-right-radius: 20px;background-size: contain;">
          <div style="position:relative">
            <el-button type="text" style="font-size: 40px;margin-top:10px;color: white">数据结构(1,2班)</el-button>
            <div style="margin-top: 25px;">
              <el-link style="color: white" href="https://element.eleme.io" target="_blank" icon="el-icon-s-grid">加课码</el-link>
              <el-link style="color: white;margin-left: 30px" href="https://element.eleme.io" target="_blank" icon="el-icon-s-custom">已有56人加入</el-link>
            </div>
            <el-button style="position:absolute;left:90%;-webkit-transform:translateX(-90%);transform:translateX(-90%);" >暂无课堂<i class="el-icon-video-play el-icon--right"></i></el-button>
          </div>
        </el-header>
        <el-menu mode="horizontal" style="height: 80px;position:relative;color: white;border-bottom-left-radius: 20px;border-bottom-right-radius: 20px">
          <el-menu-item index="1" style="position:absolute;left:35%;-webkit-transform:translateX(-35%);transform:translateX(-35%);">
            <i class="el-icon-menu"></i>
            <span slot="title">课程学习</span>
          </el-menu-item>
          <el-menu-item index="2" style="position:absolute;left:45%;-webkit-transform:translateX(-45%);transform:translateX(-45%);">
            <i class="el-icon-menu"></i>
            <span slot="title">学情分析</span>
          </el-menu-item>
          <el-menu-item index="3" style="position:absolute;left:55%;-webkit-transform:translateX(-55%);transform:translateX(-55%);">
            <i class="el-icon-document"></i>
            <span slot="title">成绩管理</span>
          </el-menu-item>
          <el-menu-item index="4" style="position:absolute;left:65%;-webkit-transform:translateX(-65%);transform:translateX(-65%);">
            <i class="el-icon-setting"></i>
            <span slot="title">课程介绍</span>
          </el-menu-item>
        </el-menu>


      </el-container>
    </el-container>
    <el-container style="height:280px;margin-top: 20px;margin-left: 50px;margin-right: 50px;background-color:white;" >
      <navbar></navbar>
    </el-container>

  </div>

</template>
<script>
import Navbar from "./Navbar";
import Learning from "./Learning";
export default {
  components: {Navbar},
  data() {
    return {
      imgUrl:require("@/assets/14.png" ),
      direction: 'ltr',
      drawer: false,
      nav: false,
      activeNames: ['1'],
    }
  },
  methods: {

    handleClose(done) {
      this.$confirm('确认关闭？')
          .then(_ => {
            done();
          })
          .catch(_ => {
          });
    },
    handleChange(val) {
      console.log(val);
    },
    handleClick() {
      alert('button click');
    }
  }
}

</script>


<style>
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}
.el-dropdown {
  vertical-align: top;
}
.el-dropdown + .el-dropdown {
  margin-left: 15px;
}
.el-icon-arrow-down {
  font-size: 12px;
}
.导航{
  background-color: #fff;
  box-shadow: 5px 5px 5px 0 rgba(0, 0, 0, .05);
  -webkit-box-shadow: #d4d2d2 0px 0px 10px;
  -moz-box-shadow: #d4d2d2 0px 0px 10px;

}
.backimage{
  background-image: url("../assets/14.png");
  height: 250px;
  border-top-right-radius: 20px;
  border-top-left-radius: 20px;
  height: 100%;
  width: 100%;
}
.button{
  border-top-right-radius: 5px;
  border-top-left-radius: 5px;
  border-bottom-left-radius: 5px;
  border-bottom-right-radius: 5px;
}
</style>
