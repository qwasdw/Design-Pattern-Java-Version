package test;

import main.Service;
import main.ServiceLocator;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        Service service = ServiceLocator.getService("service1");
        service.execute();
        service = ServiceLocator.getService("service2");
        service.execute();
        service = ServiceLocator.getService("service1");
        service.execute();
        service = ServiceLocator.getService("service2");
        service.execute();
    }
}
