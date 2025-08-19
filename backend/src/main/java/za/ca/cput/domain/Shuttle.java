package za.ca.cput.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "shuttles")
public class Shuttle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shuttleId;
    private int capacity;
    private String licensePlate;
    //private ShuttleOperator shuttleOperator;

    public Shuttle(){

    }

    protected Shuttle(Builder builder) {
        this.shuttleId = builder.shuttleId;
        this.capacity = builder.capacity;
        this.licensePlate = builder.licensePlate;
    }

    public Long getShuttleId() {
        return shuttleId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Shuttle{" +
                "shuttleId=" + shuttleId +
                ", capacity=" + capacity +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public static class Builder {

        private Long shuttleId;
        private int capacity;
        private String licensePlate;

        public Builder setShuttleId(Long shuttleId) {
            this.shuttleId = shuttleId;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Builder copy(Shuttle shuttle) {
            this.shuttleId = shuttle.shuttleId;
            this.capacity = shuttle.capacity;
            this.licensePlate = shuttle.licensePlate;
            return this;
        }

        public Shuttle build() {
            return new Shuttle(this);
        }
    }


}
