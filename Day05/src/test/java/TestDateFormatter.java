import JunitTestingPrograms.TestingDateFormatter;




    import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class TestDateFormatter {

        @Test
        void testValidDateFormat() throws ParseException {
            String formattedDate = TestingDateFormatter.formatDate("2024-02-15");
            assertEquals("15-02-2024", formattedDate);
        }
        @Test
        void testNullDate() {
            assertThrows(IllegalArgumentException.class, () -> TestingDateFormatter.formatDate(null));
        }

        @Test
        void testEmptyDate() {
            assertThrows(IllegalArgumentException.class, () -> TestingDateFormatter.formatDate(""));
        }
    }


