package test;

import main.Student;
import main.StudentDao;
import main.StudentDaoImpl;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()){
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
        }

        Student student = studentDao.getStudent(0);
        student.setName("Michael");
        studentDao.updateStudent(student);
        System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
    }
}
