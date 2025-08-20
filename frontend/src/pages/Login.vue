<template>
  <div>
    <h1>Login</h1>
    <form @submit.prevent="login">
      <label>Email:</label>
      <input v-model="email" type="email" required />
      <label>Password:</label>
      <input v-model="password" type="password" required />
      <button type="submit">Login</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return { email: '', password: '' }
  },
  methods: {
    async login() {
      try {
        const res = await axios.post('http://localhost:8080/api/users/login', {
          email: this.email,
          password: this.password
        })
        alert('Login success: ' + JSON.stringify(res.data))
      } catch (err) {
        alert('Login failed: ' + err.message)
      }
    }
  }
}
</script>
