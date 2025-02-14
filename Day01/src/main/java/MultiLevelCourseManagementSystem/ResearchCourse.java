package MultiLevelCourseManagementSystem;

public class ResearchCourse extends CourseType {
    public String courseID;
    public ResearchCourse(String name, double price, String courseID) {
        super(name, price);
        courseID = courseID;
    }
    public void display() {
        System.out.println("Research " + name + " is " + price + "$" + "courseID: " + courseID );
    }
}
