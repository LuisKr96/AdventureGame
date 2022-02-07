package com.tsi.krumbacher.luis.Game;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {

    public static int [][] StartLocation = {{0},{0}};

    public int [][] Forrest = {{0},{1}};
    public int [][] Cave = {{0},{2}};
    public int [][] Mountains = {{1},{0}};
    public int [][] Lake = {{1},{1}};
    public int [][] Sea = {{1},{2}};
    public int [][] Swamp = {{2},{0}};
    public int [][] Castle = {{2},{1}};
    public int [][] Treasure = {{2},{2}};


    public static boolean getStartLocation(){
        return Arrays.deepEquals(StartLocation, Map.getPosition());
    }

    public boolean getForrestLocation(){
        return Arrays.deepEquals(Forrest, Map.getPosition());
    }

    public boolean getCaveLocation(){
        return Arrays.deepEquals(Cave, Map.getPosition());
    }

    public boolean getMountainsLocation(){
        return Arrays.deepEquals(Mountains, Map.getPosition());
    }

    public boolean getLakeLocation(){
        return Arrays.deepEquals(Lake, Map.getPosition());
    }

    public boolean getSeaLocation(){
        return Arrays.deepEquals(Sea, Map.getPosition());
    }

    public boolean getSwampLocation(){
        return Arrays.deepEquals(Swamp, Map.getPosition());
    }

    public boolean getCastleLocation(){
        return Arrays.deepEquals(Castle, Map.getPosition());
    }

    public boolean getTreasureLocation(){
        return Arrays.deepEquals(Treasure, Map.getPosition());
    }
}
