package javatests.player;

public class Player {
    Dice dice;
    private int minNumbreToWin;

    public Player(Dice dice, int minNumbreToWin) {
        this.dice = dice;
        this.minNumbreToWin = minNumbreToWin;
    }

    public boolean play(){
        int diceNumber = dice.roll();

        return diceNumber >= minNumbreToWin;
    }
}
