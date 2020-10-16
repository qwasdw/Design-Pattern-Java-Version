package test;

import main.BusinessDelegate;
import main.Client;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
