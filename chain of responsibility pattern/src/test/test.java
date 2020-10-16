package test;

import main.*;
import org.junit.Test;

public class test {

    public AbstractLogger getChain(){
        AbstractLogger errorLogger = new ErrorLogger(3);
        AbstractLogger fileLogger = new FileLogger(2);
        AbstractLogger consoleLogger = new ConsoleLogger(1);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }


    @Test
    public void test(){


        AbstractLogger chain = getChain();
        chain.logMessage(1, "This is a information.");
        chain.logMessage(2, "This is a debug information.");
        chain.logMessage(3, "This is an error information.");
    }
}
