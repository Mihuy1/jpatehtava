package org.otp2;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        TimeSpentDAO timeSpentDAO = new TimeSpentDAO();

        Student student = new Student("Patrik Hyytiainen", "patrikhy@metropolia.fi");
        studentDAO.addStudent(student);

        TimeSpent timeSpent = new TimeSpent(3, 4, 2, student);
        timeSpentDAO.addTimeSpent(timeSpent);

        Student retrievedStudent = studentDAO.findStudent(student);
        System.out.println(retrievedStudent);
    }

}
