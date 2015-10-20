public class GuessTheNumber {
    private int tries;
    private final int number;
    private boolean isOver = false;
    private IOInterface io;
    int input;

    public GuessTheNumber(IOInterface io, int number) {
        this.number = number;
        this.io = io;
        this.tries = 1;
    }

    public boolean isMatch(int guessed) {
        if (guessed == number) {
            return isOver = true;
        }
        else if (tries == 6) {
            return isOver = true;
        }
        return isOver;
    }

    public boolean gameLoop() {
        while (!isMatch(input = io.getInput())) {
            tries += 1;
            }
        return isOver;
    }
}
