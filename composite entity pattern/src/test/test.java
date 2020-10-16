package test;

import main.Client;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Test2", "Data2");
        client.printData();
    }
}
