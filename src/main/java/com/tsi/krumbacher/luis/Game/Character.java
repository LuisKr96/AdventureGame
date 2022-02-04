package com.tsi.krumbacher.luis.Game;

import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Character {

    int playerHealth;
    String playerWeapon;
    String playerName;
    int attackDamage = 20;
    int enemyAttackDamage = 40;
    int bandages = 5;
    int enemyHealth = 100;
    int moneyInInventory;
    int bandageHealingPoints = 20;

    public static int[] Position() {
        int[] StartPosition = {0, 0};
        return StartPosition;
    }

    private Location room;

    public void setRoom(Location aRoom) {
        this.room = aRoom;
    }

    public Location getRoom() {
        return this.room;
    }

    public Character() {

    }


    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    String[] enemies = {"Policeman", "Civilian", "Cartel leader", "FBI", "Politician"};

    public void playerSetUp() {

        playerHealth = 100;
        moneyInInventory = 2000;

        playerWeapon = "Sword";

        System.out.println("Your health: " + playerHealth);
        System.out.println("Your Weapon: " + playerWeapon);


        System.out.println("Please enter your name:");

        playerName = input.nextLine();
        System.out.println("Welcome to the game " + playerName + ". The adventure begins here");
    }

    public void attack() {
        int setEnemyHealth = rand.nextInt(enemyHealth);
        String enemyName = enemies[rand.nextInt(enemies.length)];
        System.out.println("\t# " + enemyName + " is ready to fight #\n");

        while (setEnemyHealth > 0) {
            System.out.println("\t Current health: " + playerHealth);
            System.out.println("\t" + enemyName + "'s current health: " + enemyHealth);
            System.out.println("What do you want to do next?");
            System.out.println("\t 1. Hit enemy!");
            System.out.println("\t 2. Bandage up!");
            System.out.println("\t 3. RUN");
            System.out.println("");

            String userInput = input.nextLine();
            if (userInput.equals("1")) {

                int damageToOpponent = rand.nextInt(attackDamage);
                int damageTaken = rand.nextInt(enemyAttackDamage);

                enemyHealth -= damageToOpponent;
                playerHealth -= damageTaken;

                System.out.println("-----------------------------------------");
                System.out.println("\t> You hit " + enemyName + " for " + damageToOpponent + " damage.");
                System.out.println("\t> You have taken " + damageTaken + " damage.");
                System.out.println("-----------------------------------------");

                if (playerHealth <= 0) {
                    System.out.println("\t" + enemyName + " killed you. YOU LOSE");
                    break;
                }
                if (enemyHealth <= 0) {
                    System.out.println("You have killed a monster!!!");
                    bandages++;
                    moneyInInventory++;

                    System.out.println("You now have " + bandages + " bandages in your inventory.");
                    System.out.println("You now have " + moneyInInventory + " pounds(£) in your inventory.");
                    break;
                }
            } else if (userInput.equals("2")) {
                if (bandages > 0) {

                    playerHealth += bandageHealingPoints;
                    bandages--;
                    System.out.println("\t> You took one bandage. Healing " + bandageHealingPoints + " ."
                            + "\n\t> You have " + playerHealth + " health"
                            + "\n\t> Now you have " + bandages + " bandages left.\n");
                } else {
                    System.out.println("\t> No bandages left");
                }
            } else if (userInput.equals("3")) {
                System.out.println("\t You ran away from " + enemyName);

            } else {
                System.out.println("Invalid input");
            }

        }
    }



}
