package dev.bootcamp.parkinglot;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

    private final int numberOfSlots;
    private final Set<Car> parkedCars;
    private ParkingLotOwner owner;


    public ParkingLot(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        parkedCars = new HashSet<Car>();
    }

    public void subscribe(ParkingLotOwner owner) {
        this.owner = owner;
    }

    public boolean park(Car car) {
        if(isParkingFull()) {
            return false;
        }
        if (parkedCars.size() == numberOfSlots - 1) {
            owner.update(true);
        }
        return parkedCars.add(car);
    }

    public boolean unpark(Car car) {
        if (owner.isMyParkinglotFull())
            owner.update(false);
        return parkedCars.remove(car);
    }

    public boolean isParkingFull() {
        return numberOfSlots == parkedCars.size();
    }

    public ParkingLotOwner getOwner() {
        return owner;
    }
}
