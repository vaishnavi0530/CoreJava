package interfaces;

public class ValidMobileNumber implements Validator {
    @Override
    public boolean isValid(String number) {
        return number.matches("[6-9][0-9]{9}");
    }
}