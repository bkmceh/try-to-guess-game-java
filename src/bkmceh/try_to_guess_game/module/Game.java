package bkmceh.try_to_guess_game.module;

import bkmceh.try_to_guess_game.controlls.MoveController;

public class Game {

    private final String name;

    private final Player player;

    private final MoveController moveController;

    public Game(final String name, final Player player, final MoveController moveController) {
        this.name = name;
        this.player = player;
        this.moveController = moveController;
    }

    public void showName() {
        System.out.format("Game: %s", name);
    }

    public MoveController getMoveController() {
        return moveController;
    }

}
