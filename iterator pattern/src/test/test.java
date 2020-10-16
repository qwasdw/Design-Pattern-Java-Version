package test;

import main.Iterator;
import main.NameRepository;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
