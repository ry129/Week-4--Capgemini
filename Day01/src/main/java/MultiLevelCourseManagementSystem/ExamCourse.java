package MultiLevelCourseManagementSystem;

public class ExamCourse extends CourseType {
    public String courseID;
    public ExamCourse(String name, double price, String courseID) {
        super(name, price);
        courseID = courseID;
    }
    public void display() {
        System.out.println("Exam Course " + name + " is " + price + "$" + "courseID: " + courseID );

    }
}
