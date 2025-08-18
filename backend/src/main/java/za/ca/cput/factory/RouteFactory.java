package za.ca.cput.factory;

import za.ca.cput.domain.Route;

public class RouteFactory {
    public static Route createRoute(String id, String name) {
        return new Route(id, name);
    }
}
