package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Schedule;
import za.ca.cput.service.ScheduleService;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class SchedulesController {

    private final ScheduleService scheduleService;

    @Autowired
    public SchedulesController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/add")
    public Schedule addSchedule(@RequestBody Schedule schedule) {
        return scheduleService.create(schedule);
    }


    @GetMapping("/all")
    public List<Schedule> getAllSchedules() {
        return scheduleService.getAll();
    }


    @GetMapping("/{id}")
    public Schedule getSchedule(@PathVariable Long id) {
        return scheduleService.read(id);
    }


    @PutMapping("/update")
    public Schedule updateSchedule(@RequestBody Schedule schedule) {
        return scheduleService.update(schedule);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        scheduleService.delete(id);
    }
}
