public class Rock implements GameStrategy {
    public Figure figure() {
        return Figure.ROCK;
    }

    public boolean isWinWith(Figure figure) {
        return figure == Figure.SCISSORS;
    }
}
