package JunitTestingPrograms;

public class TestingPasswordStrengthValidator {
    public static boolean isValidPassword(String password) {
            if (password == null || password.length() < 8) {
                return false;
            }
            boolean hasUppercase = false;
            boolean hasDigit = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                }
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }
            return hasUppercase && hasDigit;
        }
        public static void main(String[] args) {
        System.out.println(isValidPassword("123456"));
        System.out.println(isValidPassword("User@999"));

        }
    }


