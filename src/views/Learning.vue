<template>
  <div>
    <el-container style="height:500px;width:1420px;margin-top: 20px;border-bottom-left-radius: 20px;border-bottom-right-radius: 20px;
    margin-right: 50px;border-top-left-radius: 20px;border-top-right-radius: 20px;
    background-color:white;border: 2px solid #eee;" >
        <el-collapse accordion style="width: 100%;margin-left: 20px;border-top-right-radius: 20px">
          <el-collapse-item>
            <template slot="title"><i class="header-icon el-icon-s-management">
              第一章 设计模式概述</i>
            </template>
            <div>与现实生活一致：与现实生活的流程、逻辑保持一致，遵循用户习惯的语言和概念；</div>
            <div>在界面中一致：所有的元素和结构需保持一致，比如：设计样式、图标和文本、元素的位置等。</div>
          </el-collapse-item>
          <el-collapse-item>
            <template slot="title"><i class="header-icon el-icon-s-management">
              第二章 面向对象设计原则</i>
            </template>
            <div>与现实生活一致：与现实生活的流程、逻辑保持一致，遵循用户习惯的语言和概念；</div>
            <div>在界面中一致：所有的元素和结构需保持一致，比如：设计样式、图标和文本、元素的位置等。</div>
          </el-collapse-item>
          <el-collapse-item>
            <template slot="title"><i class="header-icon el-icon-s-management">
              第三章 简单工厂模式</i>
            </template>
            <div>与现实生活一致：与现实生活的流程、逻辑保持一致，遵循用户习惯的语言和概念；</div>
            <div>在界面中一致：所有的元素和结构需保持一致，比如：设计样式、图标和文本、元素的位置等。</div>
          </el-collapse-item>
          <el-collapse-item>
            <template slot="title"><i class="header-icon el-icon-s-management">
              第四章 工厂方法模式</i>
            </template>
            <div>与现实生活一致：与现实生活的流程、逻辑保持一致，遵循用户习惯的语言和概念；</div>
            <div>在界面中一致：所有的元素和结构需保持一致，比如：设计样式、图标和文本、元素的位置等。</div>
          </el-collapse-item>
        </el-collapse>

    </el-container>

  </div>
</template>

<script>
export default {
  name: "Learning",
  data() {
    return {
      activeNames: ['1']
    };
  },
  methods: {
    handleChange(val) {
      console.log(val);
    }
  }
}
</script>

<style scoped>

.chapter{
  margin-left: 20px;
}
</style>