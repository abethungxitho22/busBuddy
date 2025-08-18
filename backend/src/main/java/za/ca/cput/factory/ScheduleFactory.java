package za.ca.cput.factory;

import za.ca.cput.domain.Schedule;

public class ScheduleFactory {
    public static Schedule createSchedule(String id, String routeId, String departureTime) {
        return new Schedule(id, routeId, departureTime);
    }
}
