package com.tsi.krumbacher.luis.Game;

public class Location extends Map{

    private int x, y;
    private String name;
    private String description;

    public Location(String aName, String aDescription, int x, int y){
        this.name = aName;
        this.description = aDescription;
        this.x = x;
        this.y = y;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }


    public int getXCoordinate(){
        return x;
    }
    public void setXCoordinate(int x){
        this.x = x;
    }
    public int getYCoordinate(){
        return y;
    }
    public void setYCoordinate(int y){
        this.y = y;
    }



}
