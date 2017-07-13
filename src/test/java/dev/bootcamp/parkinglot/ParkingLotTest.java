package dev.bootcamp.parkinglot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    @Before
    public void setup(){
        ParkingLotOwner owner = new ParkingLotOwner();
        parkingLot = new ParkingLot(2);
        parkingLot.subscribe(owner);
    }

    @Test
    public void testParkCar() {
        Car car = new Car("KA 01 AA 1234");
        assertTrue(parkingLot.park(car));
    }

    @Test
    public void testParkCar_alreadyParkedCar() {
        Car car = new Car("KA 01 AA 1234");
        parkingLot.park(car);
        assertFalse(parkingLot.park(car));
    }

    @Test
    public void testParkCar_whenAllSlotsAreFull() {
        parkingLot.park(new Car("KA 01 AA 1234"));
        parkingLot.park(new Car("TN 01 AA 1234"));
        assertFalse(parkingLot.park(new Car("KA 01 AA 7890")));
    }

    @Test
    public void testUnparkCar_parkedCar() {
        Car car = new Car("KA 01 AA 1234");
        parkingLot.park(car);
        assertTrue(parkingLot.unpark(car));
    }

    @Test
    public void testUnparkCar_unparkedCar() {
        Car car = new Car("KA 01 AA 1234");
        assertFalse(parkingLot.unpark(car));
    }

    @Test
    public void testIsParkingLotFull_whenFullyOccupied(){
        parkingLot.park(new Car("KA 01 AA 1234"));
        parkingLot.park(new Car("TN 01 AA 1234"));
        assertTrue(parkingLot.isParkingFull());
    }

    @Test
    public void testIsParkingLotFull_whenNotFullyOccupied(){
        parkingLot.park(new Car("KA 01 AA 1234"));
        assertFalse(parkingLot.isParkingFull());
    }

    @Test
    public void testNotifyOwner_whenParkingLotIsFull() {
        parkingLot.park(new Car("KA 01 AA 1234"));
        parkingLot.park(new Car("TN 01 AA 1234"));

        assertTrue(parkingLot.getOwner().isMyParkinglotFull());

    }

    @Test
    public void testNotifyOwner_WhenParkingLotIsAvailableAgain () {
        Car car1 = new Car("KA 01 AA 1234");
        parkingLot.park(car1);
        parkingLot.park(new Car("TN 01 AA 1234"));
        parkingLot.unpark(car1);

        assertFalse(parkingLot.getOwner().isMyParkinglotFull());
    }
}
