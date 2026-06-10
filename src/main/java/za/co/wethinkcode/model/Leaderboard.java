package za.co.wethinkcode.model;

import java.util.*;

public class Leaderboard {

    // TODO: declare private fields:
    // rankings (List<Student>)
    private ArrayList<Student>rankings;
    // studentLookup (HashMap<Integer, Student>)
    private HashMap<Integer ,Student>studentLookup;

    // TODO: implement constructor:
    public Leaderboard() {
        this.rankings=new ArrayList<>();
        this.studentLookup=new HashMap<>();
    }
    //
    // - initialise rankings as n;ew ArrayList<>()
    // - initialise studentLookup as new HashMap<>()

    // TODO: implement addStudent(Student student)
    // - add student to rankings
    // - add student to studentLookup
    // - call updateRankings()
    public void addStudent(Student student) {
        rankings.add(student);
        studentLookup.put(student.getId(),student);

    }

    // TODO: implement getStudentById(int studentId)
    // - return student from HashMap
    // - return null if not found
    public Student getStudent(int studentId) {
        if(studentLookup.containsKey(studentId)) {
            return studentLookup.get(studentId);
        }
        return null;
    }

    // TODO: implement getTopStudent()
    // - return first student in rankings
    // - return null if rankings empty


    // TODO: implement getRankings()
    // - return defensive copy
    public List<Student> getRankings() {
        return new ArrayList<>(rankings);
    }

    // TODO: implement updateRankings()
    //
    // Ranking Rules:
    // - highest GPA first
    // - if GPA ties, preserve insertion order
    //
    // Hint:
    // - use Comparator

    // TODO: implement totalStudents()
    // - return number of students
    public int totalStudents() {
        return rankings.size();
    }

    // TODO: override toString()
    // Example:
    // Leaderboard:
    // 1. John - GPA 3.9
    // 2. Sarah - GPA 3.7
    @Override
    public String toString() {
        return "learderboard " + rankings;
    }

}