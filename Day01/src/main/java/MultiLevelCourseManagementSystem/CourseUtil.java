package MultiLevelCourseManagementSystem;

import java.util.List;

public class CourseUtil{
    public static void displayItems(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.display();
        }
    }
}
