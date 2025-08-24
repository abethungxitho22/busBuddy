package za.ca.cput.domain;

import java.time.LocalDateTime;

public class Schedule {
    private Long scheduleId;
    private Shuttle shuttle;
    private ShuttleOperator operator;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;


    protected Schedule() {}

    public Schedule(Builder builder) {
        this.scheduleId = builder.scheduleId;
        this.shuttle = builder.shuttle;
        this.operator = builder.operator;
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
        this.availableSeats = builder.availableSeats;
    }


    public Long getScheduleId() {
        return scheduleId;
    }

    public Shuttle getShuttle() {
        return shuttle;
    }

    public ShuttleOperator getOperator() {
        return operator;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", shuttle=" + shuttle +
                ", operator=" + operator +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", availableSeats=" + availableSeats +
                '}';
    }

    public static class Builder {
        private Long scheduleId;
        private Shuttle shuttle;
        private ShuttleOperator operator;
        private String origin;
        private String destination;
        private LocalDateTime departureTime;
        private LocalDateTime arrivalTime;
        private int availableSeats;

        public Builder setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        public Builder setShuttle(Shuttle shuttle) {
            this.shuttle = shuttle;
            return this;
        }

        public Builder setOperator(ShuttleOperator operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDepartureTime(LocalDateTime departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public Builder setArrivalTime(LocalDateTime arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        public Builder setAvailableSeats(int availableSeats) {
            this.availableSeats = availableSeats;
            return this;
        }

        public Builder copy(Schedule schedule) {
            this.scheduleId = schedule.scheduleId;
            this.shuttle = schedule.shuttle;
            this.operator = schedule.operator;
            this.origin = schedule.origin;
            this.destination = schedule.destination;
            this.departureTime = schedule.departureTime;
            this.arrivalTime = schedule.arrivalTime;
            this.availableSeats = schedule.availableSeats;
            return this;
        }


    }
}
