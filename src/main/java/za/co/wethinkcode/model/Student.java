package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // TODO: declare private fields:
    private int id;
    private String name;
    private int level;
    private double gpa;
    private List<Course>registeredCourses;
    private List<Assignment>completedAssignments;

    // TODO: implement constructor:
    public Student(int id, String name,int level,double gpa) {
        this.id=id;
        this.name=name;
        this.level=1;
        this.gpa=0.0;
        this.registeredCourses=new ArrayList<>();
        this.completedAssignments=new ArrayList<>();

    }
    //
    // Initial values:
    // - level = 1
    // - gpa = 0.0
    // - registeredCourses = new ArrayList<>()
    // - completedAssignments = new ArrayList<>()

    // TODO: implement getters:
    // int getId()
    public int getId() {
        return id;
    }
    // String getName()
    public String getName() {
        return name;
    }
    // int getLevel()
    public int getLevel() {
        return level;
    }
    // double getGpa()
    public double getGpa() {
        return gpa;
    }

    // TODO: implement registerCourse(Course course)
    // - add course if not already registered
    public void registerCourse(Course course) {
        if(registeredCourses.contains(course)) {
            throw new IllegalArgumentException("course is alreay there");
        }
        registeredCourses.add(course);

    }

    // TODO: implement completeAssignment(Assignment assignment)
    // - add assignment to completedAssignments
    public void completeAssignment(Assignment assigment) {
        if(completedAssignments.contains(assigment)) {
            throw new IllegalArgumentException("assigment already there");
        }
        completedAssignments.add(assigment);
    }

    // TODO: implement updateGpa(double newGpa)
    // Rules:
    // - throw IllegalArgumentException if newGpa < 0
    // - throw IllegalArgumentException if newGpa > 4.0
    // - otherwise update GPA
    public void updateGPA(double newGpa) {
        if(newGpa<0) {
            throw new IllegalArgumentException() ;
        }if (newGpa>4.0) {
            throw new IllegalArgumentException();
        }
        this.gpa=newGpa;

    }

    // TODO: implement levelUp()
    // - increase level by 1
    public void levelUp() {
        level=level+1;
    }

    // TODO: implement getRegisteredCourses()
    // - return defensive copy

    public List<Course> getRegisteredCourses() {
        return new ArrayList<>(registeredCourses);
    }

    // TODO: implement getCompletedAssignments()
    // - return defensive copy
    public List<Assignment> getCompletedAssignments() {
        return new ArrayList<>(completedAssignments);
    }

    // TODO: override toString()
    // Example:
    // Student: John (Level 2, GPA 3.5)
    @Override
    public String toString() {
        return name + "( " + "Level " + level + "GPA " + gpa;
    }
}



