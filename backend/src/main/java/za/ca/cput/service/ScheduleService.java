package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Schedule;
import za.ca.cput.repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleService implements IScheduleService{

    private final ScheduleRepository repository;

    @Autowired
    public ScheduleService(ScheduleRepository repository){
        this.repository = repository;
    }

    @Override
    public Schedule create(Schedule schedule) {
        return repository.save(schedule);
    }

    @Override
    public Schedule read(Long scheduleId) {
        return this.repository.findById(scheduleId).orElse(null);
    }

    @Override

    public Schedule update(Schedule schedule) {
        return repository.save(schedule);


    }
   @Override
   public boolean delete(Long scheduleId) {
       this.repository.deleteById(scheduleId);
       return !this.repository.existsById(scheduleId);

}

   @Override
   public List<Schedule> getAll() {
        return repository.findAll();
    }
}
