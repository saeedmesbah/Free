
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Student {
    private String password;
    private String username;
    private int credit;
    private ArrayList<String> lesson;
    private Double average;        

    public Student(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<String> getLesson() {
        return lesson;
    }

    public void addLesson(String lesson) {
        this.lesson.add(lesson);
    }

    public Double getAverage() {
        return average;
    }
    
    

    
}
