package com.company.questions.cars;

public abstract class Car {
    private String name;
    private boolean isSedan;
    private String seats;
    private String mileage;

    public Car(String name , boolean isSedan, String seats) {
        this.name = name;
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public boolean isSedan() {
        return isSedan;
    }

    public void setSedan(boolean sedan) {
        isSedan = sedan;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public abstract String getMileage();

    public abstract void setMileage(String mileage);

    public String toString() {
        return name + " is"
                + (isSedan ? " a sedan, " : " not a sedan,")
                + " is " + seats + "-seater, and has a mileage of around "
                + getMileage();
    }
}
