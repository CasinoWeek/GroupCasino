package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.CasinoGames;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public interface GameInterface extends Runnable {
    /**
     * adds a player to the game
     * @param player the player to be removed from the game
     */
    void add(PlayerInterface player);

    /**
     * removes a player from the game
     * @param player the player to be removed from the game
     */
    void remove(PlayerInterface player);

    /**
     * specifies how the game will run
     */
    void run();
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int getMysteryNumber(){
        int mysteryNumber = new Random().nextInt(10);
        return mysteryNumber;
    }

    public static String getSringInput(String input){
        Scanner sc = new Scanner(System.in);
        println(input);
        String userInput = sc.nextLine();
        return userInput;
    }
}
