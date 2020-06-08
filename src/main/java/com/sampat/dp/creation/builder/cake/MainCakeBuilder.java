package com.sampat.dp.creation.builder.cake;

public class MainCakeBuilder {

    public static void main(String[] args) {
        Cake whiteCake = new Cake.Builder().eggs(1).butter(1).bakingpowder(0.5).build();
        System.out.println(whiteCake);
    }
}
