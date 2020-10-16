package test;

import main.Computer;
import main.ComputerPart;
import main.ComputerPartDisplayVisitor;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
