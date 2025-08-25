<template>
  <div>
    <h1>Register</h1>
    <form @submit.prevent="register">
      <label>Name:</label>
      <input v-model="name" type="text" required />
      <label>Email:</label>
      <input v-model="email" type="email" required />
      <label>Password:</label>
      <input v-model="password" type="password" required />
      <button type="submit">Register</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return { name: '', email: '', password: '' }
  },
  methods: {
    async register() {
      try {
        const res = await axios.post('http://localhost:8080/api/users/register', {
          name: this.name,
          email: this.email,
          password: this.password
        })
        alert('Registration success: ' + JSON.stringify(res.data))
      } catch (err) {
        alert('Registration failed: ' + err.message)
      }
    }
  }
}
</script>
