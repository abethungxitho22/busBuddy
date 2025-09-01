package za.ca.cput.service;

import org.springframework.stereotype.Service;
import za.ca.cput.domain.Ticket;
import za.ca.cput.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService implements ITicketService {

    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    public Ticket create(Ticket ticket) {
        return repository.save(ticket);
    }

    @Override
    public Ticket read(Long id) {
        Optional<Ticket> ticket = repository.findById(id);
        return ticket.orElse(null);
    }

    @Override
    public Ticket update(Ticket ticket) {
        if (repository.existsById(ticket.getTicketId())) {
            return repository.save(ticket);
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Ticket> getAll() {
        return repository.findAll();
    }
}
