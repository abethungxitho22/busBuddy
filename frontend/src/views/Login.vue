<template>
  <div class="page-container">
    <header class="header">
      <img src="@/assets/cput-logo.svg" alt="CPUT Logo" class="logo" />
      <h1>Cape Peninsula University of Technology</h1>
    </header>

    <main class="content">
      <h2>Login</h2>

      <div class="form-group">
        <label>Email / Student ID</label>
        <input type="text" placeholder="example@student.cput.ac.za" v-model="email" />
      </div>

      <div class="form-group">
        <label>Password</label>
        <input type="password" placeholder="********" v-model="password" />
      </div>

      <div class="form-actions">
        <label>
          <input type="checkbox" v-model="rememberMe" /> Remember me
        </label>
        <a href="#" class="link">Forgot password?</a>
      </div>

      <button class="btn" @click="login">Login</button>

      <p class="signup-link">
        Don't have an account?
        <router-link to="/signup" class="link">Sign Up</router-link>
      </p>
    </main>

    <footer class="footer">
      <img src="@/assets/hgts-logo.svg" alt="HGTS Logo" class="footer-logo" />
      <p>getting you there, and back.</p>
    </footer>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      email: "",
      password: "",
      rememberMe: false,
    };
  },
  methods: {
    login() {
      alert(`Logging in with: ${this.email}`);
    },
  },
};
</script>

<style scoped>
.page-container {
  display: flex;
  flex-direction: column;
  height: 100vh;
  background: #e6f0fa;
}

.header {
  background-color: #003865;
  padding: 10px;
  text-align: center;
  color: white;
}

.logo {
  height: 40px;
}

.content {
  flex: 1;
  padding: 20px;
}

.form-group {
  margin-bottom: 15px;
}

.form-group input {
  width: 100%;
  padding: 10px;
  border-radius: 8px;
  border: 1px solid #ccc;
}

.form-actions {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.btn {
  width: 100%;
  padding: 12px;
  background-color: #003865;
  color: white;
  border: none;
  border-radius: 8px;
  margin-top: 15px;
  cursor: pointer;
}

.link {
  color: #0056b3;
  text-decoration: none;
}

.signup-link {
  margin-top: 15px;
  text-align: center;
}

.footer {
  background: white;
  text-align: center;
  padding: 10px;
}

.footer-logo {
  height: 30px;
}
</style>
