package AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class resumeScreeningSystem {
    public static void main(String[] args) {
        // Creating Job Role Objects
        SoftwareEngineer se = new SoftwareEngineer("Amit", 3);
        DataScientist ds = new DataScientist("Priya", 5);
        ProductManager pm = new ProductManager("Raj", 7);

        // Using Generic Class Resume<T>
        Resume<SoftwareEngineer> resumeSE = new Resume<>(se);
        Resume<DataScientist> resumeDS = new Resume<>(ds);
        Resume<ProductManager> resumePM = new Resume<>(pm);

        // Reviewing individual resumes
        resumeSE.reviewResume();
        resumeDS.reviewResume();
        resumePM.reviewResume();

        // Processing multiple resumes using wildcard method
        List<JobRole> resumeList = new ArrayList<>();
        resumeList.add(se);
        resumeList.add(ds);
        resumeList.add(pm);

        ResumeProcessor.processAllResumes(resumeList);
    }
}
