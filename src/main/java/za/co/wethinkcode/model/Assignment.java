package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

    // TODO: declare private fields:
    private int assignmentId;              // unique identifier for the assignment
    private String title;                  // title of the assignment
    private int totalMarks;                // maximum marks available
    private List<Submission> submissions;

    // TODO: implement constructor:
    public Assignment(int assignmentId, String title, int totalMarks) {
        if(totalMarks<0 || totalMarks>100) {
            throw new IllegalArgumentException();
        }
        this.assignmentId=assignmentId;
        this.title=title;
        this.totalMarks=totalMarks;
        this.submissions=new ArrayList<>();
    }
    //
    // Rules:
    // - totalMarks cannot be negative
    // - totalMarks cannot exceed 100
    // - initialise submissions as new ArrayList<>()

    // TODO: implement getters:
    public int getAssignmentId() {
        return assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    // TODO: implement addSubmission(Submission submission)
    // - add submission to submissions list
    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }

    // TODO: implement getSubmissions()
    // - return defensive copy
    public List<Submission>getSubmissions() {
        return new ArrayList<>(submissions);
    }

    // TODO: implement getSubmissionCount()
    // - return number of submissions
    public int getSubmissionCount() {
        return submissions.size();
    }

    // TODO: override toString()
    // Example:
    // Assignment: OOP Project (100 Marks)
    @Override
    public String toString() {
        return title;
    }
}