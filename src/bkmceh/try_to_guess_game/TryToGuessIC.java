package bkmceh.try_to_guess_game;

import bkmceh.try_to_guess_game.controlls.MoveController;
import bkmceh.try_to_guess_game.module.Game;
import bkmceh.try_to_guess_game.module.Player;
import bkmceh.try_to_guess_game.view.ConsoleView;

import java.util.Scanner;

public class TryToGuessIC {
    public static void main(String[] args) {

        int begin = 1;

        int end = 100;

        Player player = new Player();

        MoveController moveController = new MoveController();

        moveController.setBegin(begin);

        moveController.setEnd(end);

        System.out.println("Hello, write your name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        player.setName(name);

        System.out.format("%s, choose the number from %s to %s\n", player.getName(), begin, end);

        Game game = new Game("Try to guess number", player, moveController);

        ConsoleView consoleView = new ConsoleView(game);

        game.showName();
        System.out.println("0 is less, 1 is more or equal");

        while (moveController.newGuess()) {
            consoleView.show();
        }
        consoleView.show();
    }
}
