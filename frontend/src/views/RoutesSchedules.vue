<template>
  <div class="page-container">
    <header class="header">
      <img src="@/assets/cput-logo.svg" alt="CPUT Logo" class="logo" />
      <h1>Cape Peninsula University of Technology</h1>
    </header>

    <main class="content">
      <h2>Routes & Schedules</h2>

      <div class="form-group">
        <label for="route">Select Route</label>
        <select id="route" v-model="selectedRoute">
          <option>Route A</option>
          <option>Route B</option>
          <option>Route C</option>
        </select>
      </div>

      <table class="schedule-table">
        <thead>
          <tr>
            <th>Time</th>
            <th>Departure</th>
            <th>Arrival</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(row, index) in filteredSchedule" :key="index">
            <td>{{ row.time }}</td>
            <td>{{ row.departure }}</td>
            <td>{{ row.arrival }}</td>
          </tr>
        </tbody>
      </table>

      <p class="note">⏱ Estimated times. Subject to traffic conditions.</p>

      <button class="btn" @click="refreshSchedule">Refresh Schedule</button>
    </main>

    <footer class="footer">
      <img src="@/assets/hgts-logo.svg" alt="HGTS Logo" class="footer-logo" />
      <p>getting you there, and back.</p>
    </footer>
  </div>
</template>

<script>
export default {
  name: "RoutesSchedules",
  data() {
    return {
      selectedRoute: "Route A",
      schedules: [
        { route: "Route A", time: "07:30 AM", departure: "Campus", arrival: "Bellville" },
        { route: "Route A", time: "08:30 AM", departure: "Bellville", arrival: "Campus" },
        { route: "Route B", time: "09:30 AM", departure: "Campus", arrival: "Town" },
      ],
    };
  },
  computed: {
    filteredSchedule() {
      return this.schedules.filter(s => s.route === this.selectedRoute);
    },
  },
  methods: {
    refreshSchedule() {
      alert("Schedule refreshed!");
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

.form-group select {
  width: 100%;
  padding: 10px;
  border-radius: 8px;
  border: 1px solid #ccc;
}

.schedule-table {
  width: 100%;
  border-collapse: collapse;
  margin-bottom: 15px;
}

.schedule-table th,
.schedule-table td {
  border: 1px solid #ccc;
  padding: 8px;
  text-align: center;
}

.note {
  font-size: 12px;
  color: #555;
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

.footer {
  background: white;
  text-align: center;
  padding: 10px;
}

.footer-logo {
  height: 30px;
}
</style>
