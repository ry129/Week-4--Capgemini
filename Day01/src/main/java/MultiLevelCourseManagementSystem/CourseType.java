package MultiLevelCourseManagementSystem;

import java.util.*;

public abstract  class CourseType {
    public String name;
    public double price;

    CourseType(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void display();
}


