package za.ca.cput.factory;


import za.ca.cput.domain.Shuttle;

public class ShuttleFactory {

    public Shuttle createShuttle(int capacity, String licensePlate) {

        if (capacity <= 0) {
            return null;
        }
            return new Shuttle.Builder()
                    .setCapacity(capacity)
                    .setLicensePlate(licensePlate)
                    .build();
        }
    }

