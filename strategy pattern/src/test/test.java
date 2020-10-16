package test;

import main.Context;
import main.OperationAdd;
import main.OperationMultiply;
import main.OperationSubtract;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        Context context1 = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context1.executeStrategy(10, 5));

        Context context2 = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context2.executeStrategy(10, 5));

        Context context3 = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context3.executeStrategy(10, 5));
    }
}
