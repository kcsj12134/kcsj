import Vue from 'vue'
import VueRouter from 'vue-router'
import Student from '../views/Student'
import  Teacher from '../views/Teacher'
import Home from '../views/Home'
import Login from '../views/Login'
import Yishang from  '../views/Yishang'
import Detail from '../views/Detail'
import Yixia from '../views/Yixia'
import Ershang from "../views/Ershang";
import Homepage from "@/views/face/Homepage";
import * as path from "path";
import Course from "@/views/Course";
import Analysis from "@/views/Analysis";
import Learning from "@/views/Learning";


Vue.use(VueRouter);

const routes = [
  {
    path: '/login',
    name: 'Login',
    component: Login,
    hidden: true
  },
  {
    path: '/detail',
    name:'课程详情',
    component: Detail,
    children:[
      {
        path:'analysis',
        name:'Analysis',
        component:Analysis
      },
      {
        path:'course',
        name:'course',
        component:Course
      },
      {
        path:'learning',
        name:'learning',
        component:Learning
      }
    ]
  },
  {
    path: '/',
    name: 'Homepage',
    component: Homepage,
    hidden: true
  },
  {
    path: '/home',
    name: 'Home',
    component: Home,
    hidden: true
  },
  {
    path: '/home',
    name: 'Home',
    component: Home,
    children:[
      {
        path: '/student',
        name: '管理学生',
        component: Student
      },
      {
        path: '/yishang',
        name: '大一上选课',
        component: Yishang
      },
      {
        path:'/yixia',
        name:'大一下选课',
        component: Yixia
      },
      {
        path: '/ershang',
        name: '大二上选课',
        component: Ershang
      }
    ]
  },
]

const router = new VueRouter({
  routes
})

export default router
