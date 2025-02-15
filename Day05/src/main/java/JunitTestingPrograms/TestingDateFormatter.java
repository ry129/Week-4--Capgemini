package JunitTestingPrograms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestingDateFormatter {

        public static String formatDate(String inputDate) throws ParseException {
            if (inputDate == null || inputDate.isEmpty()) {
                throw new IllegalArgumentException("Date cannot be null or empty");
            }

            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        }
        public static void main(String[] args) throws ParseException {
            String inputDate = "2000-01-01";
            System.out.println(formatDate(inputDate));

        }
    }



