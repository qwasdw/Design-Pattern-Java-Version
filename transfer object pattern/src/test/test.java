package test;

import main.StudentBO;
import main.StudentVO;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        StudentBO studentBO = new StudentBO();

        for (StudentVO student : studentBO.getAllStudents()){
            System.out.println("Student: [Roll No: " + student.getRollNo() + ", Name: " + student.getName());
        }

        StudentVO studentVO = studentBO.getStudent(0);
        studentVO.setName("Michael");
        studentBO.updateStudent(studentVO);
        System.out.println("Student: [Roll No: " + studentVO.getRollNo() + ", Name: " + studentVO.getName());
    }
}
