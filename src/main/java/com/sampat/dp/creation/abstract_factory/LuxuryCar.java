package com.sampat.dp.creation.abstract_factory;

public class LuxuryCar extends Car
{
    public LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}
