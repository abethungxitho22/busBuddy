package za.ca.cput.service;

import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;

import java.util.List;

public interface IShuttleService extends IService<Shuttle, Long>  {
    List<Shuttle> getAll();
    List<Shuttle> getByShuttleOperator(ShuttleOperator operator);
    List<Shuttle> searchBylicensePlate(String keyword);
    List<Shuttle> filterByCapacity(int minCapacity, int maxCapacity);
}
//need to commit this changes