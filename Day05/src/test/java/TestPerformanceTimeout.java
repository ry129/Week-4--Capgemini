import JunitTestingPrograms.TestingPerformance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestPerformanceTimeout {
    @Test
    @Timeout(value =2 , unit = TimeUnit.SECONDS)
    public void testPerformanceTimeout() throws InterruptedException {
        String result = TestingPerformance.longRunningTask();
       assertEquals("Task completed", result);

    }
}
