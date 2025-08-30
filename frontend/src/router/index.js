import { createRouter, createWebHistory } from 'vue-router'
import Home from '../pages/Home.vue'
import Login from '../pages/Login.vue'
import Signup from '../pages/Signup.vue'
import Booking from '../pages/Booking.vue'
import Schedule from '../pages/Schedule.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home,
    meta: {requiresAuth : true}
  },

  { path: '/login',
    name: 'login',
    component: Login
   },

  { path: '/signup', 
    component: Signup 
  },

  { path: '/booking', 
    component: Booking
   },

  { path: '/schedule', 
    component: Schedule
   }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})


router.beforeEach((to, from, next) => {
  const isAuthenticated = !!localStorage.getItem('user')

  if (to.meta.requiresAuth && !isAuthenticated) {
    next('/login')
  }
  else if (to.path === '/login' && isAuthenticated) {
    next('/')
  }
  else {
    next()
  }
})

export default router
