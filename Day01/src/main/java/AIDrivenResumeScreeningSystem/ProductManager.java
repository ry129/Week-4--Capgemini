package AIDrivenResumeScreeningSystem;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    void processResume() {
        System.out.println("Processing Resume for Product Manager: " + candidateName);
        System.out.println("Experience: " + experienceYears + " years\nSkills: Business Strategy, UX, Agile");
    }
}
