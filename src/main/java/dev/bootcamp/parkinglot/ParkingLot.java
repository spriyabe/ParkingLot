package dev.bootcamp.parkinglot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParkingLot {

    private final int id;
    private final int numberOfSlots;
    private final Set<Car> parkedCars;
    private final List<ParkingLotObserver> observers;


    public ParkingLot(int id, int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        parkedCars = new HashSet<Car>();
        observers = new ArrayList<ParkingLotObserver>();
        this.id = id;
    }

    public void subscribe(ParkingLotObserver observer) {
        this.observers.add(observer);
    }

    public boolean park(Car car) {
        if(isParkingFull()) {
            return false;
        }
        if (parkedCars.size() == numberOfSlots - 1) {
            notifyAllObservers(true);
        }
        return parkedCars.add(car);
    }

    private void notifyAllObservers(boolean status) {
        for(ParkingLotObserver observer: observers) {
            observer.update(this,status);
        }
    }


    public boolean unpark(Car car) {
        if (isParkingFull())
            notifyAllObservers(false);
        return parkedCars.remove(car);
    }

    public boolean isParkingFull() {
        return numberOfSlots == parkedCars.size();
    }

    public List<ParkingLotObserver> getObservers() {
        return observers;
    }
}
