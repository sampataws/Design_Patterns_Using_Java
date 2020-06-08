package com.sampat.dp.creation.abstract_factory;

import com.sampat.dp.creation.abstract_factory.Car;
import com.sampat.dp.creation.abstract_factory.CarType;

public class SedanCar extends Car {

   public SedanCar(Location location){
       super(CarType.SEDAN,location);
       construct();
   }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}