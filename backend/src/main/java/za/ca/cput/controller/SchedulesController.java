package za.ca.cput.controller;

import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Schedule;
import za.ca.cput.factory.ScheduleFactory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/schedules")
public class SchedulesController {
    private final List<Schedule> schedules = new ArrayList<>();

    @PostMapping("/add")
    public Schedule addSchedule(@RequestBody Schedule schedule) {
        Schedule newSchedule = ScheduleFactory.createSchedule(
                schedule.getId(), schedule.getRouteId(), schedule.getDepartureTime()
        );
        schedules.add(newSchedule);
        return newSchedule;
    }

    @GetMapping("/all")
    public List<Schedule> getAllSchedules() {
        return schedules;
    }
}
