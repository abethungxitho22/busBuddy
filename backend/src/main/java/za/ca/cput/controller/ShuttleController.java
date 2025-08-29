package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.service.IShuttleService;

import java.util.List;

@RestController
@RequestMapping("/shuttles")
public class ShuttleController {

    private final IShuttleService service;

    @Autowired
    public ShuttleController(IShuttleService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Shuttle create(@RequestBody Shuttle shuttle) {
        return service.create(shuttle);
    }

    @GetMapping("/read/{id}")
    public Shuttle read(@PathVariable Long id) {
        return service.read(id);
    }

    @PutMapping("/update")
    public Shuttle update(@RequestBody Shuttle shuttle) {
        return service.update(shuttle);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/getAll")
    public List<Shuttle> getAll() {
        return service.getAll();
    }

    // Custom queries

    @GetMapping("/category")
    public List<Shuttle> getByShuttleOperator(@PathVariable ShuttleOperator operator) {
        return service.getByShuttleOperator(operator);
    }

    @GetMapping("/search")
    public List<Shuttle> searchBylicensePlate(@RequestParam String keyword) {
        return service.searchBylicensePlate(keyword);
    }

    @GetMapping("/capacity")
    public List<Shuttle> filterByCapacity(@RequestParam int minCapacity, @RequestParam int maxCapacity) {
        return service.filterByCapacity(minCapacity, maxCapacity);
    }


}
