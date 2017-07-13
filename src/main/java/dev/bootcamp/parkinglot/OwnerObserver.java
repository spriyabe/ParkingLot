package dev.bootcamp.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class OwnerObserver extends ParkingLotObserver{

    private Map<ParkingLot, Boolean> parkingLots = new HashMap<ParkingLot, Boolean>();


    public boolean isParkinglotFull(ParkingLot parkingLot) {
        return parkingLots.get(parkingLot);
    }

    public void update(ParkingLot parkingLot, boolean status) {
        parkingLots.put(parkingLot,status);
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLot.subscribe(this);
        parkingLots.put(parkingLot,false);
    }

    public ParkingLot selectParkingLot() {
        for(Map.Entry<ParkingLot, Boolean> parkinglot : parkingLots.entrySet()) {
            if(!parkinglot.getValue())
                return parkinglot.getKey();
        }
        return null;
    }
}
