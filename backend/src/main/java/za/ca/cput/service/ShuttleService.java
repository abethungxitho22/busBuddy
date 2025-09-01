package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.repository.IShuttleRepository;
import za.ca.cput.repository.IShuttleRepository;

import java.util.List;

@Service
public class ShuttleService implements IShuttleService{

    private final IShuttleRepository shuttleRepository;

    @Autowired
    public ShuttleService(IShuttleRepository repository) {
        this.shuttleRepository = repository;
    }


    @Override
    public Shuttle create(Shuttle shuttle) {
        return shuttleRepository.save(shuttle);
    }

    @Override
    public Shuttle read(Long shuttleId) {
        return this.shuttleRepository.findById(shuttleId).orElse(null);
    }

    @Override
    public Shuttle update(Shuttle shuttle) {
        return shuttleRepository.save(shuttle);
    }

    @Override
    public boolean delete(Long shuttleId) {
        if (shuttleRepository.existsById(shuttleId)) {
            shuttleRepository.deleteById(shuttleId);
            return true;
        }
        return false;

    }

    @Override
    public List<Shuttle> getAll() {
        return this.shuttleRepository.findAll();
    }

    @Override
    public List<Shuttle> getByShuttleOperator(ShuttleOperator operator) {
        return List.of();
    }

    @Override
    public List<Shuttle> searchBylicensePlate(String keyword) {
        return List.of();
    }

    @Override
    public List<Shuttle> filterByCapacity(int minCapacity, int maxCapacity) {
        return List.of();
    }
}
