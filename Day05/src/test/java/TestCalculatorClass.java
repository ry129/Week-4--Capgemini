 import JunitTestingPrograms. TestingCalculatorClass;
 import org.junit.jupiter.api.Test;

 import java.util.*;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.junit.jupiter.api.Assertions.assertThrows;


 public class TestCalculatorClass {
    @Test
     void testAdd() {
        assertEquals(30,TestingCalculatorClass.add(10,20));
    }
    @Test
     void testSubtract() {
        assertEquals(-10,TestingCalculatorClass.subtract(10,20));
    }
    @Test
     void testMultiply() {
        assertEquals(200,TestingCalculatorClass.multiply(10,20));
    }
    @Test
     void testDivide() {
        assertThrows(ArithmeticException.class, () -> TestingCalculatorClass.divide(10, 0));

    }
}
