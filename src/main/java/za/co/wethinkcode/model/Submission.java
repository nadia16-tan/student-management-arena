package za.co.wethinkcode.model;

public class Submission {

    // TODO: declare private fields:
    private int submissionId;   // unique identifier for the submission
    private int studentId;      // ID of the student who submitted
    private int assignmentId;   // ID of the assignment this belongs to
    private int marksAwarded;

    // TODO: implement constructor:
    public Submission(int submissionId, int studentId, int assignmentId, int marksAwarded) {
        if (marksAwarded < 0) {
            throw new IllegalArgumentException("marksAwarded cannot be negative");
        }
        if (marksAwarded > 100) {
            throw new IllegalArgumentException("marksAwarded cannot exceed 100");
        }

        this.submissionId = submissionId;
        this.studentId = studentId;
        this.assignmentId = assignmentId;
        this.marksAwarded = marksAwarded;
    }

    // TODO: implement getters:
    public int getSubmissionId() {
        return submissionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public int getMarksAwarded() {
        return marksAwarded;
    }


    // TODO: implement updateMarks(int newMarks)
    //
    // Rules:
    // - throw IllegalArgumentException if newMarks < 0
    // - throw IllegalArgumentException if newMarks > 100
    // - otherwise update marksAwarded
    public void updateMarks(int newMarks) {
        if(newMarks<0 || newMarks>100) {
            throw new IllegalArgumentException();
        }
        this.marksAwarded=newMarks;
    }

    // TODO: override toString()
    // Example:
    // Submission 1 | Student 10 | Assignment 5 | Marks: 85
    @Override
    public String toString() {
        return "marks " + marksAwarded;
    }
}