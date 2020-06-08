package com.sampat.dp.creation.builder.home;


/* "Abstract Builder" */

public interface HouseBuilder {

    public void buildBasement();

    public void buildStructure();

    public void bulidRoof();

    public void buildInterior();

    public House getHouse();
}
