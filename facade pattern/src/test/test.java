package test;

import main.ShapeMaker;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
