package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.repository.ShuttleRepository;

import java.util.List;

@Service
public class ShuttleService implements IShuttleService{

    private final ShuttleRepository shuttleRepository;

    @Autowired
    public ShuttleService(ShuttleRepository repository) {
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
    public void delete(Long shuttleId) {
        shuttleRepository.deleteById(shuttleId);

    }

    @Override
    public List<Shuttle> getAll() {
        return this.shuttleRepository.findAll();
    }
}
