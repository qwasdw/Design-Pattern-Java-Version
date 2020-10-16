package test;

import main.FrontController;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        frontController.dispatchRequest("student");
    }
}
