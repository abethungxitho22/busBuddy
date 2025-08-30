<template>
  <div class="booking-container">
    <!-- Header -->
    <header class="header">
      <h1 class="title">BusBuddy Booking</h1>
    </header>

    <!-- Booking Form -->
    <form class="booking-form">
      <label for="route">Select Route</label>
      <select id="route" v-model="form.route">
        <option disabled value="">-- Choose a Route --</option>
        <option value="A">Route A (Campus ↔ Bellville)</option>
        <option value="B">Route B (Campus ↔ Town)</option>
        <option value="C">Route C (Campus ↔ Airport)</option>
      </select>

      <label for="date">Select Date</label>
      <input type="date" id="date" v-model="form.date" />

      <label for="passengers">Passengers</label>
      <input type="number" id="passengers" v-model="form.passengers" min="1" max="10" />

      <button type="button" class="btn" @click="bookNow">Book Now</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "Booking",
  data() {
    return {
      form: {
        route: "",
        date: "",
        passengers: 1,
      },
    };
  },
  methods: {
    bookNow() {
      if (!this.form.route || !this.form.date) {
        alert("Please fill in all fields!");
        return;
      }
      alert(
        `✅ Booking successful!\nRoute: ${this.form.route}\nDate: ${this.form.date}\nPassengers: ${this.form.passengers}`
      );
    },
  },
};
</script>

<style scoped>
.booking-container {
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

.booking-form {
  display: flex;
  flex-direction: column;
  gap: 15px;
}

.booking-form label {
  font-weight: bold;
  margin-bottom: 5px;
}

.booking-form input,
.booking-form select {
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 10px;
}

.btn {
  background: #003865;
  color: white;
  padding: 12px;
  border: none;
  border-radius: 10px;
  cursor: pointer;
  font-size: 16px;
}

.btn:hover {
  background: #0050a0;
}
</style>
