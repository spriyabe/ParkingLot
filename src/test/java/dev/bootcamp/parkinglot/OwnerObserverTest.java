package dev.bootcamp.parkinglot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerObserverTest {

    @Test
    public void testOwnerDecisionOnParkingLotForParkingTheCar () {
        OwnerObserver owner = new OwnerObserver();
        ParkingLot lot1 = new ParkingLot(22, 2);
        ParkingLot lot2 = new ParkingLot(33, 3);
        ParkingLot lot3 = new ParkingLot(44, 4);

        owner.addParkingLot(lot1);
        owner.addParkingLot(lot2);
        owner.addParkingLot(lot3);

        lot1.park(new Car("KA 01 AA 1234"));
        lot1.park(new Car("MH 01 AA 1234"));
        lot2.park(new Car("TN 01 AA 1234"));

        Assert.assertFalse(owner.selectParkingLot().isParkingFull());

    }
}