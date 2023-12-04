import java.util.Scanner;
public class Game {

    Scanner myScanner = new Scanner(System.in);
    private Player player1;

    public Game(Player player) {
        player1 = player;
    }

    public void additionGame() { //addition game that gives random addition questions
        while (player1.getScore() > 0) {
            for (int moves = player1.getStartingNumberOfMoves(); moves > 0; moves--) {
                int randNum = (int)(Math.random() * 49) + 1;
                int randNum2 = (int)(Math.random() * 49) + 1;
                System.out.println("What is " + randNum + " + " + randNum2 + "?");
                int answer = myScanner.nextInt();
                if (answer == randNum + randNum2) {
                    System.out.println("Correct!");
                    player1.setScore(player1.getScore() + 1);
                    System.out.println("You have " + player1.getScore() + " points.");
                } else {
                    System.out.println("Incorrect.");
                    player1.setScore(player1.getScore() - 1);
                    System.out.println("You have " + player1.getScore() + " points.");
                }
            }
            break;
        }
    }

    public void subtractionGame() {//subtraction game that gives random subtraction questions
        int moves = player1.getStartingNumberOfMoves();
        while (player1.getScore() > 0 && moves > 0) {
            int randNum = (int)(Math.random() * 49) + 1;
            int randNum2 = (int)(Math.random() * 49) + 1;
            System.out.println("What is " + randNum + " - " + randNum2 + "?");
            int answer = myScanner.nextInt();
            if (answer == randNum - randNum2) {
                System.out.println("Correct!");
                player1.setScore(player1.getScore() + 1);
                moves -= 1;
            } else {
                System.out.println("Incorrect.");
                player1.setScore(player1.getScore() - 1);
                moves -= 1;
                System.out.println("You have " + player1.getScore() + " points.");
            }
        }
    }

    public void multiplicationGame() {//multiplication game that gives random multiplication questions
        int moves = player1.getStartingNumberOfMoves();
        while (player1.getScore() > 0 && moves > 0) {
            int randNum = (int)(Math.random() * 10) + 1;
            int randNum2 = (int)(Math.random() * 10) + 1;
            System.out.println("What is " + randNum + " * " + randNum2 + "?");
            int answer = myScanner.nextInt();
            if (answer == randNum * randNum2) {
                System.out.println("Correct!");
                player1.setScore(player1.getScore() + 1);
                moves -= 1;
                System.out.println("You have " + player1.getScore() + " points.");
            } else {
                System.out.println("Incorrect.");
                player1.setScore(player1.getScore() - 1);
                moves -= 1;
                System.out.println("You have " + player1.getScore() + " points.");
            }
        }
    }

    public void intDivisionGame() {//integer division game that gives random integer division questions
        int moves = player1.getStartingNumberOfMoves();
        while (player1.getScore() > 0 && moves > 0) {
            int randNum = (int)(Math.random() * 10) + 1;
            int randNum2 = (int)(Math.random() * 10) + 1;
            System.out.println("What is " + randNum + " / " + randNum2 + "?");
            int answer = myScanner.nextInt();
            if (answer == randNum / randNum2) {
                System.out.println("Correct!");
                player1.setScore(player1.getScore() + 1);
                System.out.println("You have " + player1.getScore() + " points.");
                moves -= 1;
            } else {
                System.out.println("Incorrect.");
                player1.setScore(player1.getScore() - 1);
                moves -= 1;
                System.out.println("You have " + player1.getScore() + " points.");
            }
        }
    }

    public void bonusRound(int multiplier) {
        int bonus = (int)(Math.random() * multiplier) + 1;
        int randomNumber = (int) (Math.random() * 2) + 1;
        if (randomNumber == 1) {
            System.out.println("You have earned " + bonus + " points for this round.");
            player1.setScore(player1.getScore() + bonus);
        } else {
            System.out.println("You have lost " + bonus + " points for this round.");
            player1.setScore(player1.getScore() - bonus);
        }
    }
}
  
