<template>
  <div style="margin-top: 20px">
    <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect" style="margin-left: 10px">
      <router-link  class="links" to="/detail/learning" ><i class="el-icon-coin" >章节目录</i></router-link>
      <router-link  class="links" to="/detail/course"><i class="el-icon-bank-card">互动课件</i> </router-link>
      <router-link  class="links" to="/detail/analysis"><i class="el-icon-notebook-2">作业</i></router-link>
      <router-link  class="links" to="/detail/grades"><i class="el-icon-edit">测试</i></router-link>
      <router-link  class="links" to="/detail/intruduuction"><i class="el-icon-reading">资料</i> </router-link>
      <router-link  class="links" to="/detail/intruduuction"><i class="el-icon-place">腾讯会议</i></router-link>
      <router-link  class="links" to="/detail/intruduuction"><i class="el-icon-chat-line-round">公告</i> </router-link>
      <router-link  class="links" to="/detail/intruduuction"><i class="el-icon-postcard">话题</i></router-link>
      <router-link  class="links" to="/detail/intruduuction"><i class="el-icon-thumb">互动答题</i> </router-link>
    </el-menu>
    <div>
      <router-view></router-view>
    </div>
  </div>



</template>

<style>
.links{
  margin-left: 30px;
}
</style>