package dev.bootcamp.parkinglot;

public class SecurityObserver extends ParkingLotObserver{

    private boolean parkinglotStatus;

    public boolean isParkinglotFull(ParkingLot parkingLot) {
        return parkinglotStatus;
    }

    public void update(ParkingLot parkingLot, boolean status) {
        parkinglotStatus = status;
    }
}
