package dev.bootcamp.parkinglot;

/**
 * Created by shanmughapriya on 13/07/17.
 */
public class ParkingLot {

    public boolean park(Car car) {
        car.setIsParked(true);
        return true;
    }

    public boolean unpark(Car car) {
        return true;
    }
}
