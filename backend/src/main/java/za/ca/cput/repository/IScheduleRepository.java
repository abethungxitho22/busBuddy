package za.ca.cput.repository;

import za.ca.cput.domain.Schedule;
import java.util.List;

public interface IScheduleRepository {
    Schedule save(Schedule schedule);
    List<Schedule> findAll();
    Schedule findById(String id);
}
