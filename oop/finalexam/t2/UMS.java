package oop.finalexam.t2;

import java.util.ArrayList;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void printStudentData(Student student) {
        System.out.println("==========================================");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Argus ID: " + student.getArgus());
        System.out.println("Courses:");

        List<LearningCourse> courses;

        if (student.getArgus().equals("01024075949")) {
            // This is "yourself" – return your Argus data
            courses = getMyArgusCourses();
        } else {
            // Return regular student course list
            courses = student.getLearningCourses();
        }

        for (LearningCourse course : courses) {
            System.out.println("------------------------------------------");
            System.out.println("Title: " + course.getTitle());
            System.out.println("Prerequisites: " + course.getAcceptancePrerequisites());
            System.out.println("Topics: " + course.getMajorTopics());
        }

        System.out.println("==========================================\n");
    }

    private List<LearningCourse> getMyArgusCourses() {
        List<LearningCourse> myCourses = new ArrayList<>();

        myCourses.add(new LearningCourse(
            "Calculus II",
            "MATH150 Calculus I",
            "Antiderivatives. Definite integrals. Techniques and applications of integration. Improper integrals. Infinite series."
        ));

        myCourses.add(new LearningCourse(
            "Computer Organization",
            "CS50 Introduction to Programming",
            "Representing and manipulating information. Machine-level representations of programs. Optimizing program performance. The memory hierarchy."
        ));

        myCourses.add(new LearningCourse(
            "Mathematical Foundation of Computing",
            "MATH 150 Calculus I, CS50 Introduction to Programming",
            "Mathematical Logic; Elements of Discrete Mathematics; Elements of Sets Theory; Elements of Graph Theory; Elements of Combinatorics; Elements of Digital Systems."
        ));

        myCourses.add(new LearningCourse(
            "Object Oriented Programming",
            "CS50 Introduction to Programming",
            "Java syntax and data structures; Procedural programming; Classes; Encapsulation, polymorphism, inheritance; Packages; Working with the network; Work with files; Working with text data; Work with the terminal."
        ));

        return myCourses;
    }
}
