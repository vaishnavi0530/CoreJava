package interfaces;

public class ValidAge implements Validator {
    @Override
    public boolean isValid(String ageStr) {
        if (ageStr == null || ageStr.isEmpty()) {
            return false;
        }

        boolean isValidAge = false;
        int age = 0;

        for (int i = 0; i < ageStr.length(); i++) {
            char c = ageStr.charAt(i);
            if (c >= '0' && c <= '9') {
                age = age * 10 + (c - '0');
            } else {
                isValidAge = false;
                break;
            }
        }

        if (age > 17) {
            isValidAge = true;
        }

        return isValidAge;
    }
}