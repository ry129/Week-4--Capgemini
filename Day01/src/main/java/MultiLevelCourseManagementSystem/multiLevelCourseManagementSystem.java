package MultiLevelCourseManagementSystem;

import java.util.Arrays;
import java.util.List;

public class multiLevelCourseManagementSystem {
    public static void main(String[] args) {
            // Creating different types of courses
            ExamCourse mathExam = new ExamCourse("Math Exam", 1000, "Math Exam");
            AssignmentCourse csAssignment = new AssignmentCourse("CS Assignment", 1000, "CS Assignment");
            ResearchCourse physicsResearch = new ResearchCourse("Physics Research", 1000, "Physics Research");

            // Using the generic Course class
            Course<ExamCourse> mathCourse = new Course<>(mathExam);
            Course<AssignmentCourse> csCourse = new Course<>(csAssignment);
            Course<ResearchCourse> physicsCourse = new Course<>(physicsResearch);

            // Displaying individual courses
            mathCourse.display();
            csCourse.display();
            physicsCourse.display();

            System.out.println("\nDisplaying all courses using wildcard method:");

            // Using wildcard method to display all courses
            List<CourseType> allCourses = Arrays.asList(mathExam, csAssignment, physicsResearch);
            CourseUtil.displayItems(allCourses);
        }
    }
