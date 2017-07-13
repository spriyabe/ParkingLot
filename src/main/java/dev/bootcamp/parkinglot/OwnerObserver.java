package dev.bootcamp.parkinglot;

public class OwnerObserver extends ParkingLotObserver{

    private boolean parkinglotStatus;

    public boolean isParkinglotFull() {
        return parkinglotStatus;
    }

    public void update(boolean status) {
        parkinglotStatus = status;
    }
}
