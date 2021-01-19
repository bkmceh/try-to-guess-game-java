package bkmceh.try_to_guess_game.view;

import bkmceh.try_to_guess_game.controlls.MoveController;
import bkmceh.try_to_guess_game.module.Game;

import java.util.Scanner;

public class ConsoleView {

    private final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }


    public void show() {
        final MoveController moveController = game.getMoveController();

        if (!moveController.newGuess()) {
            lastMove();
        } else {
            System.out.format("Is it %s?\n", moveController.getBegin()
                    + (moveController.getEnd() - moveController.getBegin()) / 2);
            int ans = askGuess();
            if (ans == 0) {
                moveController.setEnd(moveController.getBegin()
                        + (moveController.getEnd() - moveController.getBegin()) / 2);
            }
            if (ans == 1) {
                moveController.setBegin(moveController.getBegin()
                        + (moveController.getEnd() - moveController.getBegin()) / 2);
            }
        }
    }

    private int askGuess() {
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextInt();
    }

    private void lastMove() {

        final MoveController moveController = game.getMoveController();

        System.out.format("Is it %s?\n", moveController.getEnd());

        int answer = askGuess();
        if (answer == 0) {
            System.out.format("Is it %s\n", moveController.getBegin());
        }
        if (answer == 1) {
            System.out.format("Is it %s\n", moveController.getEnd());
        }
    }
}
