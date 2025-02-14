package AIDrivenResumeScreeningSystem;
import java.util.*;
abstract class JobRole {
   public String candidateName;
   public int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    // Abstract method to be implemented by specific job roles
    abstract void processResume();
}

