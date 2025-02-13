package org.otp2;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        TimeSpentDAO timeSpentDAO = new TimeSpentDAO();

        // Create a new student
        Student student = new Student("Patrik Hyytiainen", "patrikhy@metropolia.fi");
        studentDAO.addStudent(student);

        // Create a time record for the student
        TimeSpent timeSpent = new TimeSpent(3, 4, 2, student);
        timeSpentDAO.addTimeSpent(timeSpent);

        // Retrieve student and check their time spent records
        Student retrievedStudent = studentDAO.findStudent(student);
        System.out.println(retrievedStudent);
    }

}
