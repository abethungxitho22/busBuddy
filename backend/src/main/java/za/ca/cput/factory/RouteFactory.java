package za.ca.cput.factory;

public class RouteFactory {
    public static Route createRoute(String id, String name) {
        return new Route(id, name);
    }
}
