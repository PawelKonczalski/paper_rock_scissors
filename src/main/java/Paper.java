public class Paper implements GameStrategy {

    public Figure figure() {
        return Figure.PAPER;
    }

    public boolean isWinWith(Figure figure) {
        return figure == Figure.ROCK;
    }
}
