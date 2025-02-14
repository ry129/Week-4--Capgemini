package MultiLevelCourseManagementSystem;

public class Course<T extends CourseType>{
    private T courseType;
    public Course(T courseType) {
        this.courseType = courseType;
    }
    public void display() {
        courseType.display();
    }
    public T getCourse() {
        return courseType;
    }
}
