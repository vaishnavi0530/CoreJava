package interfaces.valid;

import interfaces.Validator;

public class Valid implements Validator {
    @Override
    public boolean isValid(String property) {
        return (property.length() > 0);
    }
}