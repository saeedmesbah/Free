
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Lesson {
    private int classTime;
    private int capacity;
    private Professor professor;
    private ArrayList<Student> students;
    private String subject;
    
    
    
    public Lesson(int classTime, int capacity, Professor professor, String subject) {
        this.classTime = classTime;
        this.capacity = capacity;
        this.professor = professor;
        this.subject = subject;
    }

    public int getClassTime() {
        return classTime;
    }

    public void setClassTime(int classTime) {
        this.classTime = classTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student students) {
        this.students.add(students);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
    
    
}
