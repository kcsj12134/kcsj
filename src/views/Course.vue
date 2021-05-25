<template>
  <el-container style="height:500px;width:1420px;margin-top: 20px;border-bottom-left-radius: 20px;border-bottom-right-radius: 20px;
    margin-right: 50px;border-top-left-radius: 20px;border-top-right-radius: 20px;
    background-color:white;border: 2px solid #eee;" >
    <el-carousel indicator-position="outside" style="width: 100%;border-top-left-radius: 20px;border-top-right-radius: 20px">
        <el-carousel-item v-for="item in imgList" :key="item">
          <img :src="item.img" style="height:100%;width:100%;">
        </el-carousel-item>
    </el-carousel>
  </el-container>
</template>

<script>
export default {
  name: "Course",
  data() {
    return {
      imgList: [
        {img: require('../assets/10.jpg')},
        {img: require('../assets/11.gif')},
        {img: require('../assets/12.jpg')},
        {img: require('../assets/13.jpg')}

      ],
    }
  }
}
</script>

<style scoped>
.el-carousel__item img {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}
.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}
.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}

</style>