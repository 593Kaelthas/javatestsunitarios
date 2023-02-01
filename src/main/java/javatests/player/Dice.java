package javatests.player;

import java.util.Random;

public class Dice {
    private int sides;


    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll(){
        //me retorna un numero entre 0 y sides
        //con el +1, logro retornar un numero entre 1 y sides
        return new Random().nextInt(sides)+1;
    }

}
