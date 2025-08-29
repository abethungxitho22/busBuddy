package za.ca.cput.factory;

import za.ca.cput.domain.Schedule;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;

import java.time.LocalDateTime;

public class ScheduleFactory {

public static Schedule createSchedule(Shuttle shuttle, ShuttleOperator operator, String origin,
   String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, int availableSeats){

    if (shuttle == null || operator == null || origin == null || destination == null ||
            departureTime == null || arrivalTime == null) {
        return null;
    }

    if (arrivalTime.isBefore(departureTime)) {
        return null;
    }

    return new Schedule.Builder()
            .setOrigin(origin)
            .setDestination(destination)
            .setDepartureTime(departureTime)
            .setArrivalTime(arrivalTime)
            .setAvailableSeats(availableSeats)
            .build();

}

  public Schedule copy(Schedule schedule) {
    return new Schedule.Builder()
            .copy(schedule)
            .build();
  }
}
