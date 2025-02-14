package AIDrivenResumeScreeningSystem;

public class Resume<T extends JobRole>{
public T jobRole;

public Resume(T jobRole) {
    this.jobRole = jobRole;
}
public void reviewResume() {
    jobRole.processResume();
}
}
