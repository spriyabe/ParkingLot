package dev.bootcamp.parkinglot;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by shanmughapriya on 13/07/17.
 */
public class ParkingLotTest {

    @Test
    public void testParkCar() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();

        assertTrue(parkingLot.park(car));
    }
}
