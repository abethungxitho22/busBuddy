package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Schedule;
import java.util.List;
import java.util.Optional;

//updated scheduleRepository

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findAll();
    Optional<Schedule> findById(Long id);

}
