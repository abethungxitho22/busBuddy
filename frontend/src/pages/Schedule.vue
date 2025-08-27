<template>
  <div class="schedule-container">
    <!-- Header -->
    <header class="header">
      <h1 class="title">BusBuddy Schedule</h1>
    </header>

    <!-- Select Route -->
    <div class="filter">
      <label for="route">Select Route</label>
      <select id="route" v-model="selectedRoute" @change="loadSchedule">
        <option value="A">Route A</option>
        <option value="B">Route B</option>
        <option value="C">Route C</option>
      </select>
      <button class="btn small" @click="loadSchedule">Refresh</button>
    </div>

    <!-- Schedule List -->
    <div v-if="schedule.length" class="schedule-list">
      <div v-for="(s, index) in schedule" :key="index" class="schedule-card">
        <p><strong>Time:</strong> {{ s.time }}</p>
        <p><strong>From:</strong> {{ s.departure }}</p>
        <p><strong>To:</strong> {{ s.arrival }}</p>
      </div>
    </div>

    <p v-else class="no-schedule">No schedule available for this route.</p>
  </div>
</template>

<script>
export default {
  name: "Schedule",
  data() {
    return {
      selectedRoute: "A",
      schedule: [],
      mockSchedules: {
        A: [
          { time: "07:30 AM", departure: "Campus", arrival: "Bellville" },
          { time: "08:30 AM", departure: "Bellville", arrival: "Campus" },
        ],
        B: [
          { time: "09:30 AM", departure: "Campus", arrival: "Town" },
          { time: "10:30 AM", departure: "Town", arrival: "Campus" },
        ],
        C: [
          { time: "11:00 AM", departure: "Campus", arrival: "Airport" },
        ],
      },
    };
  },
  created() {
    this.loadSchedule();
  },
  methods: {
    loadSchedule() {
      this.schedule = this.mockSchedules[this.selectedRoute] || [];
    },
  },
};
</script>

<style scoped>
.schedule-container {
  max-width: 420px;
  margin: auto;
  padding: 20px;
  font-family: Arial, sans-serif;
}

.header {
  text-align: center;
  margin-bottom: 25px;
}

.title {
  font-size: 22px;
  color: #003865;
}

.filter {
  display: flex;
  align-items: center;
  gap: 10px;
  margin-bottom: 20px;
}

.filter select {
  flex: 1;
  padding: 10px;
  border-radius: 10px;
  border: 1px solid #ccc;
}

.btn {
  background: #003865;
  color: white;
  padding: 10px;
  border: none;
  border-radius: 10px;
  cursor: pointer;
  font-size: 14px;
}

.btn.small {
  padding: 8px 12px;
}

.schedule-list {
  display: flex;
  flex-direction: column;
  gap: 15px;
}

.schedule-card {
  background: #f9f9f9;
  padding: 15px;
  border-radius: 12px;
  box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
}

.no-schedule {
  text-align: center;
  color: #888;
}
</style>
