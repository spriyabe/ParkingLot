package dev.bootcamp.parkinglot;

public class SecurityObserver extends ParkingLotObserver{

    private boolean parkinglotStatus;

    public boolean isParkinglotFull() {
        return parkinglotStatus;
    }

    public void update(boolean status) {
        parkinglotStatus = status;
    }
}
