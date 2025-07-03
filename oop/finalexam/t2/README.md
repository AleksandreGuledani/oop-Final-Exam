# University Management System (UMS)

## Overview
This project implements a simple University Management System in Java. It manages students and their learning courses.

---

## Classes and Design

- **UMS**: Main management class holding a list of students. It provides functionality to print detailed information about a student and their enrolled courses.

- **Student**: Represents a student with properties such as name, Argus ID, and a list of learning courses.

- **LearningCourse**: Represents a course with three String fields:
  - `title`
  - `acceptancePrerequisites`
  - `majorTopics`

All setters and getters are implemented for encapsulation.

---

## Features

- The UMS allows adding students and their courses.
- The method `printStudentData(Student student)` prints student details along with their courses.
- If the student is identified as yourself (via your Argus ID), your official courses from the Argus system are printed instead.

---

## UML Diagram

| Class          | Fields                             | Methods                            |
|----------------|----------------------------------|----------------------------------|
| **UMS**        | - `List<Student> students`       | + `addStudent(Student)`           |
|                |                                  | + `printStudentData(Student)`    |
|                |                                  | + `getMyArgusCourses()` (private)|
| **Student**    | - `String name`                  | + getters/setters                 |
|                | - `String argus`                  | + `addLearningCourse(LearningCourse)` |
|                | - `List<LearningCourse> learningCourses` |                          |
| **LearningCourse** | - `String title`               | + getters/setters                 |
|                | - `String acceptancePrerequisites` |                                  |
|                | - `String majorTopics`            |                                  |

- Arrows:

  - UMS "has a" list of Students (composition).
  - Student "has a" list of LearningCourses (composition).

You can create this UML diagram using Google Docs or any diagram tool by representing classes as tables and using arrows to indicate relationships.

---

## How to Run

1. Place all Java files in the `oop/final/t2/` folder corresponding to the package.
2. Compile and run your main class that creates a `UMS` instance, adds students and courses, and calls `printStudentData` to see output.
3. Replace `"your_argus_id_here"` in `UMS` class with your actual Argus ID to test the personalized courses.

---

## Notes

- Make sure not to upload unnecessary files to the repository.
- Keep your Argus courses data accurate for full points.
