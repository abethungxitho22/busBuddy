package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Shuttle;

import java.util.List;

public interface IShuttleRepository extends JpaRepository<Shuttle, Long> {
    List<Shuttle> findByCapacity(int capacity);
    List<Shuttle> findByLicensePlate(String licensePlate);
}
