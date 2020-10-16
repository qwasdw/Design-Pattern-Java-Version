package test;

import main.BinaryObserver;
import main.HexObserver;
import main.OctalObserver;
import main.Subject;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
