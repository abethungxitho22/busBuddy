package za.ca.cput.repository;

import za.ca.cput.domain.Route;
import java.util.List;

public interface IRouteRepository {
    Route save(Route route);
    List<Route> findAll();
    Route findById(String id);
}
