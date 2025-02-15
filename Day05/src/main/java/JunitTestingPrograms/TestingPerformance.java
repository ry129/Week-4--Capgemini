package JunitTestingPrograms;

public class TestingPerformance {
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task completed";
    }
    public static void main(String[] args) throws InterruptedException {
        TestingPerformance testingPerformance = new TestingPerformance();
        testingPerformance.longRunningTask();

    }
}
