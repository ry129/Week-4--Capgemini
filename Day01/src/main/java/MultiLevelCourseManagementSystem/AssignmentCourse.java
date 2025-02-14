package MultiLevelCourseManagementSystem;

public class AssignmentCourse extends CourseType {
    public String courseID;
    public AssignmentCourse(String name, double price, String courseID) {
        super(name, price);
        courseID = courseID;
    }
    public void display() {
        System.out.println("Assignment " + name + " is " + price + "$" + "courseID: " + courseID );
    }
}
