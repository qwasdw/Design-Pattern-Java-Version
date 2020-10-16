package test;

import main.Student;
import main.StudentController;
import main.StudentView;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        Student model = new Student();
        model.setName("Robert");
        model.setRollNo("10");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("John");
        controller.updateView();
    }
}
