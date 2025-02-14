package AIDrivenResumeScreeningSystem;

// Step 2: Specific Job Role Classes
 public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    void processResume() {
        System.out.println("Processing Resume for Software Engineer: " + candidateName);
        System.out.println("Experience: " + experienceYears + " years\nSkills: Java, DSA, System Design");
    }
}
