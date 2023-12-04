import java.util.Scanner;

public class GameTracker {

    private Scanner myScanner;
    private String gameType;
    private Player player1;

    public GameTracker() {
        myScanner = new Scanner(System.in);
        gameType = null;
    }

    public void start() {
        getPlayerInfo();
        startGame();
    }

    private void getPlayerInfo() {
        System.out.println("Welcome to a cool math game!");
        System.out.print("What is your name? ");
        String name = myScanner.nextLine();
        System.out.print("Do you want to set your score or have a random score between 5 and 10?(r for random score and s for setting a score) ");
        String scoreType = myScanner.nextLine();
        if (scoreType.equals("r")) {//if statement to choose a random score or to set score
            player1 = new Player(name);
        } else if (scoreType.equals("s")) {
            System.out.print("What score will you choose? ");
            int score = myScanner.nextInt();
            player1 = new Player(name, score);
            myScanner.nextLine();
        }
        System.out.print("Do you want a random number of moves or do you want to set the number of moves to a certain number(r for random and s for setting the number of moves)");
        String movesType = myScanner.nextLine();
        if (movesType.equals("r")) { //if statement to choose a random number of moves or to set moves
            player1.setStartingNumberOfMoves();
        } else if (movesType.equals("s")) {
            System.out.println("How many moves do you want?");
            int moves = myScanner.nextInt();
            player1.setStartingNumberOfMoves(moves);
            myScanner.nextLine();
        }
        System.out.println("Welcome " + player1.getName() + "!\nYou started with " + player1.getScore() + " points.\nYou have " + player1.getStartingNumberOfMoves() + " moves.");
        System.out.print("Do you want to play the addition, subtraction, multiplication, or integer division game?(a/s/m/d) ");
        gameType = myScanner.nextLine();
    }

    private void startGame() {
        Game game1 = new Game(player1);
        if (gameType.equals("a")) { // sets up a certain type of game depending on user's choice
            game1.additionGame();
        } else if (gameType.equals("s")) {
            game1.subtractionGame();
        } else if (gameType.equals("m")) {
            game1.multiplicationGame();
        } else if (gameType.equals("d")) {
            game1.intDivisionGame();
        }
        System.out.println("Do you want to play a bonus round(you may lose points)?(y/n)");
        String bonus = myScanner.nextLine();
        if (bonus.equals("y")) {//if statement for choosing a bonus round
            System.out.println("How many points do you want it to be worth?(This bonus is all random and you could lose points, type an int)");
            int bonusPoints = myScanner.nextInt();
            game1.bonusRound(bonusPoints);
        }
        System.out.println("You have " + player1.getScore() + " points!");
        System.out.println("Thanks for playing!");
    }
}
