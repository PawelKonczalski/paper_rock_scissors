import java.util.Random;
import java.util.Scanner;

class GameResult {
    private Figure aiFigure() {
        int hand = new Random().nextInt(Figure.values().length);
        return Figure.values()[hand];
    }

    void userFigure() {
        System.out.println("1 - Paper, 2 - Rock, 3 - Scissors, 4 - End game");
        Scanner s = new Scanner(System.in);
        int chose = 1;

        while (chose != 4) {
            chose = s.nextInt();
            if (chose > 0 && chose < 5) {
                switch (chose) {
                    case 1:
                        if (new Paper().isWinWith(aiFigure())){
                            System.out.println("You win");
                        } else if (Figure.PAPER == aiFigure()){
                            System.out.println("Draw");
                        } else {
                            System.out.println("You loss");
                        }
                        break;
                    case 2:
                        if (new Rock().isWinWith(aiFigure())){
                            System.out.println("You win");
                        } else if (Figure.ROCK == aiFigure()){
                            System.out.println("Draw");
                        } else {
                            System.out.println("You loss");
                        }
                        break;
                    case 3:
                        if (new Scissors().isWinWith(aiFigure())){
                            System.out.println("You win");
                        } else if (Figure.SCISSORS == aiFigure()){
                            System.out.println("Draw");
                        } else {
                            System.out.println("You loss");
                        }
                        break;
                    case 4:
                        System.out.println("End Game");
                        break;
                }
            } else {
                System.out.println("Wrong value!!");
            }
        }
    }
}
