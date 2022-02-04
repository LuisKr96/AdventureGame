package com.tsi.krumbacher.luis.Game;


import java.util.Random;
import java.util.Scanner;

public class Game {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

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

                String Direction = input.nextLine();

                int[] CurrentPosition = Character.Position();
                int[] CastlePosition = {(int) (Math.random() * 6), (int) (Math.random() * 6)};
                double Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]), 2) + Math.pow((CastlePosition[1] - CurrentPosition[1]), 2));
                do {
                    switch (Direction){

                        case "North":
                            CurrentPosition[0] += 1;
                            Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]), 2) + Math.pow((CastlePosition[1] - CurrentPosition[1]), 2));
                            int Chanceofarea = (int) (Math.random() * 5);
                            if (Chanceofarea == 1){
                                System.out.println(Map.Forrest());
                            }
                            else if (Chanceofarea == 2){
                                System.out.println(Map.Mountain());
                            }
                            System.out.println(Distance);
                            Direction = input.nextLine();
                            break;

                        case "South":
                            CurrentPosition[0] -= 1;
                            Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]),2) + Math.pow((CastlePosition[1] - CurrentPosition[1]),2));
                            Chanceofarea = (int) (Math.random() * 5);
                            if (Chanceofarea == 1) {
                                System.out.println(Map.Castle());
                            }
                            else if (Chanceofarea == 2){
                                System.out.println(Map.Forrest());
                            }
                            System.out.println(Distance);
                            Direction = input.nextLine();
                            break;

                        case "East":
                            CurrentPosition[1] += 1;
                            Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]), 2) + Math.pow((CastlePosition[1] - CurrentPosition[1]), 2));
                            Chanceofarea = (int) (Math.random() * 5);
                            if (Chanceofarea == 1) {
                                System.out.println(Map.Prison());
                            }
                            else if (Chanceofarea == 2){
                                System.out.println(Map.Mountain());
                            }
                            System.out.println(Distance);
                            Direction = input.nextLine();
                            break;

                        case "West":
                            CurrentPosition[1] -= 1;
                            Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]), 2) + Math.pow((CastlePosition[1] - CurrentPosition[1]), 2));
                            Chanceofarea = (int) (Math.random() * 5);
                            if (Chanceofarea == 1) {
                                System.out.println(Map.Castle());
                            }
                            else if (Chanceofarea == 2){
                                System.out.println(Map.Mountain());
                            }
                            System.out.println(Distance);
                            Direction = input.nextLine();
                            break;


                        case "Compass":
                            Distance = Math.sqrt(Math.pow((CastlePosition[0] - CurrentPosition[0]), 2) + Math.pow((CastlePosition[1] - CurrentPosition[1]), 2));
                            System.out.println(Distance);
                            Direction = input.nextLine();
                            break;

                    }


                }while (Distance == 0.0);
                System.out.println("You have found the treasure");

        }
    }
}




