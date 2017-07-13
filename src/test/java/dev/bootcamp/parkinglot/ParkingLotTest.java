package dev.bootcamp.parkinglot;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by shanmughapriya on 13/07/17.
 */
public class ParkingLotTest {

    private ParkingLot parkingLot = new ParkingLot();

    @Test
    public void testParkCar() {
        Car car = new Car();
        assertTrue(parkingLot.park(car));
    }

    @Test
    public void testUnparkCar_parkedCar() {
        Car car = new Car();
        car.setIsParked(true);
        assertTrue(parkingLot.unpark(car));
    }

    @Test
    public void testUnparkCar_unparkedCar() {
        Car car = new Car();
        assertFalse(parkingLot.unpark(car));
    }
}
