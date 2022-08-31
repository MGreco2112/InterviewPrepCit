package com.company.questions.cars;

public class HondaCity extends Car{
    private String mileage;

    public HondaCity(String mileage) {
        super("HondaCity", true, "4");
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }

    @Override
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
