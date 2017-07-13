package dev.bootcamp.parkinglot;

public abstract class ParkingLotObserver {

        public abstract boolean isParkinglotFull();

        public abstract void update(boolean status);

}
