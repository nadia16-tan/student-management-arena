package za.co.wethinkcode.model;

public class Classroom {

    private String roomNumber;       // identifier for the room
    private Course assignedCourse;   // course assigned to this room
    private int seatingCapacity;

    // TODO: implement constructor:
    public Classroom(String roomNumber, int seatingCapacity) {
        if(seatingCapacity<0) {
            throw new IllegalArgumentException();
        }
        this.roomNumber=roomNumber;
    }
    //
    // Rules:
    // - seatingCapacity must be greater than 0

    // TODO: implement getters:
    public String getRoomNumber() {
        return roomNumber;
    }

    public Course getAssignedCourse() {
        return assignedCourse;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }


    // TODO: implement assignCourse(Course course)
    // - assign course to classroom
    public void assignedCourse(Course course) {
        this.assignedCourse=course;

    }

    // TODO: override toString()
    // Example:
    // Classroom A12 (Capacity: 40)
    @Override
    public String toString() {
        return "classroom " + roomNumber;
    }
}