package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {}
