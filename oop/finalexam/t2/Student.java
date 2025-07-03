package oop.finalexam.t2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String argus;  // Unique identifier to verify if student is "yourself"
    private List<LearningCourse> learningCourses;

    public Student(String name, String argus) {
        this.name = name;
        this.argus = argus;
        this.learningCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getArgus() {
        return argus;
    }

    public void setArgus(String argus) {
        this.argus = argus;
    }

    public List<LearningCourse> getLearningCourses() {
        return learningCourses;
    }

    public void setLearningCourses(List<LearningCourse> learningCourses) {
        this.learningCourses = learningCourses;
    }

    public void addLearningCourse(LearningCourse course) {
        this.learningCourses.add(course);
    }
}
