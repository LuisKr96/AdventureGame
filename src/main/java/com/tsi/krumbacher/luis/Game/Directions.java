package com.tsi.krumbacher.luis.Game;

import java.util.List;

public class Directions {

    public Directions(){}

    public static Object getXIndex;
    public static Object getYIndex;

    private int xAxis;
    private int yAxis;
    public int IndexX;
    public int IndexY;

    private void setIndexX(int IndexX){
        this.xAxis = IndexX;
    }
    public int getIndexX(){
        return IndexX;
    }

    private void setIndexY(int IndexY){
        this.xAxis = IndexX;
    }
    public int getIndexY(){
        return IndexY;
    }


    public void goNorth(){
        if (xAxis == 0){
            xAxis = 3;
        } else {
            xAxis = xAxis - 1;
        }
    }
    public void goSouth(){
        if (xAxis == 3){
            xAxis = 0;
        } else {
            xAxis = xAxis + 1;
        }
    }
    public void goEast(){
        if (yAxis == 3){
            yAxis = 0;
        } else {
            yAxis = yAxis + 1;
        }
    }

    public void goWest(){
        if (yAxis == 3){
            yAxis = 0;
        } else {
            yAxis = yAxis + 1;
        }
    }


}
