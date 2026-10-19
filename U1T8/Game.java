package U1T8;

public class Game {
    private String GameName;
    private int players;
    private int score;
public Game (String GameName, int players){
    this.GameName = GameName;
    this.players = players;
    score = 0; }

public String getGameName() {
    return GameName;
}
public int getPlayers(){
    return players;
}
public int getScore(){
    return score;
}
public void addPlayer(){
    players++;
}

public void increaseScore(int increase){
    score = increase + score;
}

public double averageScorePerPlayer(){
    return (double) score / players;
}

public boolean isGameOver(){
    if (score >= 9){
        return true;
    }
    else{
        return false;
    }
}
}
