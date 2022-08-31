package com.company.questions.cars;

public class WagonR extends Car{
    private String mileage;

    public WagonR(String mileage) {
        super("WagonR", false, "4");
        this.mileage = mileage;
    }

    public String getMileage() {
        return mileage + " kmpl";
    }

    @Override
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
