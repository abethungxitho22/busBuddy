import { createRouter, createWebHistory } from 'vue-router'
import Home from '../pages/Home.vue'
import Login from '../pages/Login.vue'
import Register from '../pages/Register.vue'
import Booking from '../pages/Booking.vue'
import Schedule from '../pages/Schedule.vue'

const routes = [
  { path: '/', component: Home },
  { path: '/login', component: Login },
  { path: '/register', component: Register },
  { path: '/booking', component: Booking },
  { path: '/schedule', component: Schedule }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
