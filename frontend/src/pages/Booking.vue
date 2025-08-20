<template>
  <div>
    <h1>Book a Shuttle</h1>
    <form @submit.prevent="bookShuttle">
      <label>Shuttle ID:</label>
      <input v-model="shuttleId" type="number" required />
      <label>Date:</label>
      <input v-model="date" type="date" required />
      <button type="submit">Book Now</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return { shuttleId: '', date: '' }
  },
  methods: {
    async bookShuttle() {
      try {
        const res = await axios.post('http://localhost:8080/api/bookings', {
          shuttleId: this.shuttleId,
          date: this.date
        })
        alert('Booking successful: ' + JSON.stringify(res.data))
      } catch (err) {
        alert('Booking failed: ' + err.message)
      }
    }
  }
}
</script>
