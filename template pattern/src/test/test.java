package test;

import main.Cricket;
import main.Football;
import main.Game;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
