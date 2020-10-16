package test;

import main.CareTaker;
import main.Originator;
import org.junit.Test;

public class test {

    @Test
    public void test(){

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        originator.setState("State 2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First Saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second Saved State: " + originator.getState());
    }
}
