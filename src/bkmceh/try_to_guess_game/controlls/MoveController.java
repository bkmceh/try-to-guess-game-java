package bkmceh.try_to_guess_game.controlls;

public class MoveController {

    private int begin;

    private int end;

    public void setBegin(final int begin) {
        this.begin = begin;
    }

    public int getBegin() {
        return begin;
    }

    public void setEnd(final int end) {
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public boolean newGuess() {
        if (end - begin > 1) {
            return true;
        } else {
            return false;
        }
    }
}
