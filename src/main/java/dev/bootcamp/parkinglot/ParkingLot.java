package dev.bootcamp.parkinglot;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

    private final int numberOfSlots;
    private final Set<Car> parkedCars;


    public ParkingLot(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        parkedCars = new HashSet<Car>();
    }

    public boolean park(Car car) {
        if(isParkingFull()) {
            return false;
        }
        return parkedCars.add(car);
    }

    public boolean unpark(Car car) {
        return parkedCars.remove(car);
    }

    public boolean isParkingFull() {
        return numberOfSlots == parkedCars.size();
    }
}
