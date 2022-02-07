package com.tsi.krumbacher.luis.Game;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Map {

    public static int [][] gameMap = new int[3][3];
    private int startPosition = gameMap[0][0];
    private int currentPosition = startPosition;


    public static int[][] getPosition(){
        Object xAxis = Directions.getXIndex;
        Object yAxis = Directions.getYIndex;
        return new int[(int) xAxis ][(int) yAxis];
    }



    public Map(){}


















    public static String Forrest(){
        return "You have entered the dark forrest";
    }

    public static String Mountain(){
        return "You have entered the mountains";
    }

    public static String Castle(){
        return "You have entered the Castle";
    }

    public static String Prison(){
        return "You're in Prison";
    }

    public final String Description(){
        int changeOfArea = (int)(Math.random() * 5);
        String AreaDescription = "";
        if(changeOfArea == 1){
            AreaDescription = Forrest();
        }else if(changeOfArea == 2){
            AreaDescription = Prison();
        }
        return AreaDescription;
    }



}
