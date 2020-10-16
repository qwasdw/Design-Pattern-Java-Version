package test;

import main.Circle;
import main.ShapeFactory;
import org.junit.Test;

public class test {

    private String[] colors =
            {"Red", "Green", "Blue", "White", "Black"};

    private int getRandomX(){
        return (int)(Math.random() * 100);
    }

    private int getRandomY(){
        return (int)(Math.random() * 100);
    }

    private int getRandomRadius(){
        return (int)(Math.random() * 100);
    }

    private String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }

    @Test
    public void test(){

        for (int i = 0; i < 20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRandomRadius());
            circle.draw();
        }
    }
}
