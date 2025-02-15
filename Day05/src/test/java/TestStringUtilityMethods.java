import JunitTestingPrograms.TestingStringUtilityMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestStringUtilityMethods {
    @Test
    public void testStringUtilityMethods() {
        assertEquals("ayir",TestingStringUtilityMethods.reverseString("riya"));
    }
    @Test
    public void testStringUtilityMethods2() {
      assertTrue(TestingStringUtilityMethods.isPalindrome("kanak"));

    }
    @Test
    public void testStringUtilityMethods3() {
        assertEquals("RIYA",TestingStringUtilityMethods.UpperCse("Riya"));
    }


}
