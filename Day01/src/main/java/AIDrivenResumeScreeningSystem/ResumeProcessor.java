package AIDrivenResumeScreeningSystem;

import java.util.List;

public class ResumeProcessor {
    public static void processAllResumes(List<? extends JobRole> resumes) {
        System.out.println("\n--- Processing All Resumes ---");
        for (JobRole resume : resumes) {
            resume.processResume();
        }
    }
}
