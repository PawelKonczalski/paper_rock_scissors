public class Scissors implements GameStrategy {
    public Figure figure() {
        return Figure.SCISSORS;
    }

    public boolean isWinWith(Figure figure) {
        return figure == Figure.PAPER;
    }
}
