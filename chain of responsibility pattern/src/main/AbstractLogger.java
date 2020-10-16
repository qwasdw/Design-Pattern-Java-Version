package main;

public abstract class AbstractLogger {

    private int info = 1;
    private int debug = 2;
    private int error = 3;
    protected int level;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level)
            write(message);
        if (nextLogger != null)
            nextLogger.logMessage(level, message);
    }


    abstract void write(String message);
}
