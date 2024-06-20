package interfaces;

public class ValidEmail implements Validator {
    @Override
    public boolean isValid(String email) {
        return email.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}