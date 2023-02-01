package javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void lose_when_diceNumber_is_too_low() {
        Dice dice = Mockito.mock(Dice.class);
        //Con la siguiente sentencia forzamos a que mi
        //metodo roll() fuerce un retorno
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice,5);
        assertEquals(false,player.play());
    }

    @Test
    public void win_when_diceNumber_is_big() {
        Dice dice = Mockito.mock(Dice.class);
        //Con la siguiente sentencia forzamos a que mi
        //metodo roll() fuerce un retorno
        Mockito.when(dice.roll()).thenReturn(6);
        Player player = new Player(dice,3);
        assertEquals(true,player.play());
    }
}