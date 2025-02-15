import JunitTestingPrograms.TestingExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testExceptionHandling {
    @Test
    public void testExceptionHandling() {
      assertEquals(5,TestingExceptionHandling.divide(10,2));
    }
    @Test
    public void testExceptionHandling2() {
        assertThrows(ArithmeticException.class, () -> TestingExceptionHandling.divide(10,0));
    }
}
