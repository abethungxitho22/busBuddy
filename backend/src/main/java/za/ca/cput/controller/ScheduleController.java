package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Schedule;
import za.ca.cput.service.ScheduleService;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private ScheduleService service;

    @Autowired
    public ScheduleController(ScheduleService service){
        this.service = service;
    }

    @PostMapping("/create")
    public Schedule create(@RequestBody Schedule schedule){
        return service.create(schedule  );
    }
    @GetMapping("/read/{Id}")
    public Schedule read(@PathVariable Long Id){
        return service.read(Id);
    }
    @PutMapping("/update")
    public Schedule update(@RequestBody Schedule schedule){
        return service.update(schedule);
    }
    @DeleteMapping("/delete/{Id}")
    public void delete(@PathVariable Long Id){
        this.service.delete(Id);
    }
    @GetMapping("/getAll")
    public List<Schedule> getAll(){
        return service.getAll();
    }
}
