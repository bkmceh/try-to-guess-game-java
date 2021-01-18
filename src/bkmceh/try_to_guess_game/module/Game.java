package bkmceh.try_to_guess_game.module;

public class Game {

    private final String name;

    private final Player player;

    public Game(final String name, final Player player) {
        this.name = name;
        this.player = player;
    }

    public String getName() {
        return name;
    }

}
