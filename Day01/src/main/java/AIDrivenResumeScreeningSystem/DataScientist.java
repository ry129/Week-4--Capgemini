package AIDrivenResumeScreeningSystem;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    void processResume() {
        System.out.println("Processing Resume for Data Scientist: " + candidateName);
        System.out.println("Experience: " + experienceYears + " years\nSkills: Python, ML, Deep Learning");
    }
}
