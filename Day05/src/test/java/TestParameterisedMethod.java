
import JunitTestingPrograms.TestingParameterizedTests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestParameterisedMethod {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void testEvenNumber(int number) {
        assertTrue(number % 2 == 0);
    }
}


