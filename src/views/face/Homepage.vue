<template>
  <el-container>hello
    <el-button type="primary" style="width: 100%" @click="submit">登录</el-button>
  </el-container>
</template>

<script>
export default {
  name: "Homepage",
  methods:{
    submit(){
      this.$router.replace("/login")
    }
  }
}
</script>

