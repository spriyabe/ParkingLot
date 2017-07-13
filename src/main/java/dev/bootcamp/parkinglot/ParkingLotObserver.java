package dev.bootcamp.parkinglot;

public abstract class ParkingLotObserver {

        public abstract boolean isParkinglotFull(ParkingLot parkingLot);

        public abstract void update(ParkingLot parkingLot, boolean status);

}
