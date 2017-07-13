package dev.bootcamp.parkinglot;

public class Car {

    private String regNumber = null;

    public Car(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public boolean equals(Object car) {

        if(this == car)
            return true;
        if (car instanceof Car)
            return this.getRegNumber().equalsIgnoreCase(((Car) car).getRegNumber());
        return false;
    }

    @Override
    public int hashCode() {
        return this.getRegNumber().hashCode();
    }
}
