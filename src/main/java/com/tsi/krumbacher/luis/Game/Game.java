package com.tsi.krumbacher.luis.Game;


import java.util.Random;
import java.util.Scanner;

public class Game {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Map newMap = new Map();

        Character mainCharacter = new Character();
        mainCharacter.playerSetUp();

            System.out.println("-----------------------------------------");
            System.out.println("What would you like to do next?");
            System.out.println("\t 1. Go fight");
            System.out.println("\t 2. Explore map!");


            String userInput = input.nextLine();
            if (userInput.equals("1")) {
                mainCharacter.attack();
            } else if (userInput.equals("2")) {

                System.out.println("-----------------------------------------");
                System.out.println("Where would you like to got next?");
                System.out.println("\t North");
                System.out.println("\t South");
                System.out.println("\t East");
                System.out.println("\t West");
                System.out.println("\t Type Compass to view distance from treasure");
                System.out.println("-----------------------------------------");
                System.out.println("\t Go back to main menu");

                String Direction = input.nextLine();


                int[][] startPosition = Location.StartLocation;

                int[] CurrentPosition = Character.startPosition();
                int[] CastlePosition = {(int) (Math.random() * 6), (int) (Math.random() * 6)};
                double Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]), 2) + Math.pow((CastlePosition[1] - CurrentPosition[1]), 2));

            }    }    }