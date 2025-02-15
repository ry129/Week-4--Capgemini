import JunitTestingPrograms.TestingTemperatureConversions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestTemperatureConversion {
    @Test
    public void testcelsiusToFahrenheit() {
        TestingTemperatureConversions temp = new TestingTemperatureConversions();
        assertNotEquals(15.6,temp.celsiusToFahrenheit(34.5));
    }
    @Test
    public void testfahrenheitToCelsius() {
        TestingTemperatureConversions temp = new TestingTemperatureConversions();
        assertNotEquals(15.6,temp.fahrenheitToCelsius(34.5));
    }

}
