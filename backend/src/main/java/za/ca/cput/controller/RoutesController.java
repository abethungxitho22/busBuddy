package za.ca.cput.controller;

import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Route;
import za.ca.cput.factory.RouteFactory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/routes")
public class RoutesController {
    private final List<Route> routes = new ArrayList<>();

    @PostMapping("/add")
    public Route addRoute(@RequestBody Route route) {
        Route newRoute = RouteFactory.createRoute(route.getId(), route.getName());
        routes.add(newRoute);
        return newRoute;
    }

    @GetMapping("/all")
    public List<Route> getAllRoutes() {
        return routes;
    }
}
