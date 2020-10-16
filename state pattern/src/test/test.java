package test;

import main.Context;
import main.StartState;
import main.StopState;
import org.junit.Test;

public class test {

    @Test
    public void test(){

        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState());
    }
}
