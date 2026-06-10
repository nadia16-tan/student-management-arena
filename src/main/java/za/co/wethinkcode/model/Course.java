package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    // TODO: declare private fields:
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private ArrayList<Student>enrolledStudents;

    // TODO: implement constructor:
    public Course(String courseCode, String courseName, int maxCapacity) {
        if(maxCapacity<=0) {
            throw new IllegalArgumentException("cannot be less than 0");
        }
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.maxCapacity=maxCapacity;
        this.enrolledStudents=new ArrayList<>();
    }
    //
    // Rules:
    // - maxCapacity must be greater than 0
    // - initialise enrolledStudents as new ArrayList<>()

    // TODO: implement getters:
    // String getCourseCode()
    public String getCourseCode() {
        return courseCode;
    }
    // String getCourseName()
    public String getCourseName() {
        return courseName;
    }
    // int getMaxCapacity()
    public int getMaxCapacity() {
        return maxCapacity;
    }

    // TODO: implement enrollStudent(Student student)
    // - return false if course is full
    // - return false if student already enrolled
    // - otherwise add student and return true
    public boolean enrollStudent(Student student) {
        if(enrolledStudents.contains(student)) {
            return false;
        }
        if(enrolledStudents.size()>=maxCapacity) {
            return false;
        }
        enrolledStudents.add(student);
        return true;
    }

    // TODO: implement removeStudentById(int studentId)
    // - remove matching student
    // - return true if removed
    // - otherwise false
    public boolean removeStudentById(int studentId) {
      for(Student student:enrolledStudents) {
          if(student.getId()==studentId) {
              enrolledStudents.remove(student);
              return true;
          }
      }
        return false;
    }

    // TODO: implement getEnrolledStudents()
    // - return defensive copy
    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }

    // TODO: implement getTotalStudents()
    // - return number of enrolled students
    public int getTotalStudents() {
        return enrolledStudents.size();

    }

    // TODO: implement hasStudent(String studentName)
    // - return true if student exists by name
    public boolean hasStudent(String studentName) {
        for(Student student:enrolledStudents) {
            if(student.getName().equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        return false;
    }

    // TODO: override toString()
    // Example:
    // Course: CSC101 - Introduction to Programming
    @Override
    public String toString() {
        return courseName;
    }
}