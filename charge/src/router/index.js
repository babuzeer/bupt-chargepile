import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Register from '../views/Register.vue'
import Main from '@/views/Main.vue'

const routes = [
  { path: '/', redirect: '/home' },
  { path: '/home', component: Home },
  { path: '/register', component: Register },
  { path: '/main', component: Main }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
