<template>
  <div>
    <h1>Available Shuttles</h1>
    <ul>
      <li v-for="shuttle in shuttles" :key="shuttle.id">
        {{ shuttle.route }} - {{ shuttle.date }} - Seats: {{ shuttle.seatsAvailable }}
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return { shuttles: [] }
  },
  async created() {
    try {
      const res = await axios.get('http://localhost:8080/api/shuttles')
      this.shuttles = res.data
    } catch (err) {
      console.error('Failed to load shuttles:', err.message)
    }
  }
}
</script>
