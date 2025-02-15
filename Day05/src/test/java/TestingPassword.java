import JunitTestingPrograms.TestingPasswordStrengthValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestingPassword {

    @Test
    void testValidPassword() {
        assertTrue(TestingPasswordStrengthValidator.isValidPassword("Password1"));
    }

    @Test
    void testInvalidPasswordShortLength() {
        assertFalse(TestingPasswordStrengthValidator.isValidPassword("Pass1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(TestingPasswordStrengthValidator.isValidPassword("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(TestingPasswordStrengthValidator.isValidPassword("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(TestingPasswordStrengthValidator.isValidPassword(null));
    }
}


