package bkmceh.try_to_guess_game;

import bkmceh.try_to_guess_game.module.Game;
import bkmceh.try_to_guess_game.module.Player;
import bkmceh.try_to_guess_game.view.ConsoleView;

import java.util.Scanner;

public class TryToGuessIC {
    public static void main(String[] args) {

        int begin = 1;

        int end = 100;

        Player player = new Player();

        ConsoleView consoleView = new ConsoleView();

        System.out.println("Hello, write your name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        player.setName(name);

        System.out.format("%s, choose the number from 1 to 100\n", player.getName());

        Game game = new Game("Try to guess number", player);

        System.out.format("Game: %s\n", game.getName());
        System.out.println("0 is less, 1 is more or equal");

        while (end - begin > 1) {
            System.out.format("Begin: %s, End: %s\n", begin, end);
            System.out.format("Is it %s?\n", begin + (end - begin) / 2);
            Scanner scanner1 = new Scanner(System.in);
            int answer = scanner1.nextInt();
            if (answer == 0) {
                end = begin + (end - begin) / 2;
            }
            if (answer == 1) {
                begin = begin + (end - begin) / 2;
            }
        }
        System.out.format("Begin: %s, End: %s\n", begin, end);
        System.out.format("Is it %s?\n", end);
        Scanner scanner1 = new Scanner(System.in);
        int answer = scanner1.nextInt();
        if (answer == 0) {
            System.out.format("Is it %s\n", begin);
        }
        if (answer == 1) {
            System.out.format("Is it %s\n", end);
        }

    }
}
