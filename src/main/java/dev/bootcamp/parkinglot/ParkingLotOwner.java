package dev.bootcamp.parkinglot;

public class ParkingLotOwner {

    private boolean myParkinglotStatus;

    public boolean isMyParkinglotFull() {
        return myParkinglotStatus;
    }

    public void update(boolean status) {
        myParkinglotStatus = status;
    }
}
