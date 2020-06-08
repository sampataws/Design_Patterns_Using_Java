package com.sampat.dp.creation.factory;

// Car is parent class of all car instances and it will also contain the common logic applicable in car making of all types.

public abstract class Car {

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private CarType model = null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
