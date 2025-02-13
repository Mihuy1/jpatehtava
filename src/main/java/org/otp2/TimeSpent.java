package org.otp2;

import javax.persistence.*;

@Entity
public class TimeSpent {

    @Id
    @GeneratedValue
    private int id;

    private int homeworkHours;
    private int inClassHours;
    private int theoryHours;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public TimeSpent() {}

    public TimeSpent(int homeworkHours, int inClassHours, int theoryHours, Student student) {
        this.homeworkHours = homeworkHours;
        this.inClassHours = inClassHours;
        this.theoryHours = theoryHours;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public int getHomeworkHours() {
        return homeworkHours;
    }

    public int getInClassHours() {
        return inClassHours;
    }

    public int getTheoryHours() {
        return theoryHours;
    }

    public Student getStudent() {
        return student;
    }

    public void setHomeworkHours(int homeworkHours) {
        this.homeworkHours = homeworkHours;
    }

    public void setInClassHours(int inClassHours) {
        this.inClassHours = inClassHours;
    }

    public void setTheoryHours(int theoryHours) {
        this.theoryHours = theoryHours;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "TimeSpent{" +
                "id=" + id +
                ", homeworkHours=" + homeworkHours +
                ", inClassHours=" + inClassHours +
                ", theoryHours=" + theoryHours +
                ", student=" + student +
                '}';
    }

}
