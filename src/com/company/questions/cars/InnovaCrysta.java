package com.company.questions.cars;

public class InnovaCrysta extends Car{
    private String mileage;

    public InnovaCrysta(String mileage) {
        super("InnovaCrysta", false, "6");
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
