import MultiLevelCourseManagementSystem.*;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class multilevelCourseTest {



    public ExamCourse examCourse;
    public AssignmentCourse assignmentCourse;
    public ResearchCourse researchCourse;

    @BeforeEach
    void setUp() {
        examCourse = new ExamCourse("mathExam",200,"123");
        assignmentCourse= new AssignmentCourse("mathAssignment",400,"323");
        researchCourse = new ResearchCourse("mathResearch",500,"456");
    }

    @Test
     void testCourses() {

        assertEquals("mathExam", examCourse.name);
        assertEquals("mathAssignment", assignmentCourse.name);
        assertEquals("mathResearch",researchCourse.name);
        if(true){
            System.out.println("All tests passed");
        }

    }


    @Test
         void testgeneric() {
        Course<ExamCourse> course1=new Course(examCourse);
        Course<ExamCourse> course2=new Course(assignmentCourse);
        Course<ExamCourse> course3=new Course(researchCourse);

        assertNotNull(course1);
        assertNotNull(course2);
        assertNotNull(course3);
        if(true){
            System.out.println("All tests passed");
        }
    }
}