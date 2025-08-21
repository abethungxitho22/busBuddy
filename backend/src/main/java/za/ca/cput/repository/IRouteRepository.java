package za.ca.cput.repository;

import java.util.List;

public interface IRouteRepository {
    Route save(Route route);
    List<Route> findAll();
    Route findById(String id);
}
