 import JunitTestingPrograms.TestingUserRegistration;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

 public class TestUserRegistration {
        private final TestingUserRegistration registration = new TestingUserRegistration();

        @Test
        void validUserRegistration() {
            assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john@example.com", "password123"));
        }

        @Test
        void invalidUsername() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "john@example.com", "password123"));
            assertEquals("Username cannot be empty", exception.getMessage());
        }

        @Test
        void invalidEmail() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "johnexample.com", "password123"));
            assertEquals("Invalid email format", exception.getMessage());
        }

        @Test
        void invalidPassword() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "john@example.com", "pass"));
            assertEquals("Password must be at least 8 characters long", exception.getMessage());
        }
    }


