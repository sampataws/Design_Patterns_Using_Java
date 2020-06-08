package com.sampat.dp.creation.singleton;

public class MainClient {


    public static void main(String[] args) {

        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }

}
