package za.ca.cput.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Ticket;
import za.ca.cput.service.TicketService;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(service.create(ticket));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> read(@PathVariable Long id) {
        Ticket ticket = service.read(id);
        return ticket != null ? ResponseEntity.ok(ticket) : ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Ticket> update(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(service.update(ticket));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Ticket> getAll() {
        return service.getAll();
    }
}
