import { createRouter, createWebHistory } from "vue-router";
import Login from "@/views/Login.vue";
import RoutesSchedules from "@/views/RoutesSchedules.vue";

const routes = [
  { path: "/", name: "Login", component: Login },
  { path: "/routes", name: "RoutesSchedules", component: RoutesSchedules },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
