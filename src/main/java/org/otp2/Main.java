package org.otp2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        StudentDAO studentDAO = new StudentDAO();

        student1.setName("Patrik");
        student1.setEmail("patrik.doe@gmail.com");

        studentDAO.addStudent(student1);


    }

}
