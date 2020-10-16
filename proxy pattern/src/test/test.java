package test;

import main.Image;
import main.ProxyImage;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println();
        image.display();
    }
}
