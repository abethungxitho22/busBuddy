package za.ca.cput.domain;

public class Schedule {
    private String id;
    private String routeId;
    private String departureTime;

    public Schedule() {}

    public Schedule(String id, String routeId, String departureTime) {
        this.id = id;
        this.routeId = routeId;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + id + '\'' +
                ", routeId='" + routeId + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
