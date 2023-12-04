public class Player {
    private int score;
    private String name;
    private int numMoves;
    public Player(String newName, int score) {
        name = newName;
        this.score = score;
    }
    public Player(String newName) {
        name = newName;
        score = (int)(Math.random() * 6) + 5;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int newScore) {
        score = newScore;
    }
    public int getStartingNumberOfMoves() {
        return numMoves;
    }
    public void setStartingNumberOfMoves(int numMoves) {
        this.numMoves = numMoves;
    }
    public String getName() {
        return name;
    }
    public void setStartingNumberOfMoves() {
        numMoves = (int)(Math.random() * name.length()) + 1;
        if ((getName().indexOf("a") == -1) && (getName().indexOf("e") == -1)) {
            numMoves++;
        }
    }
}
