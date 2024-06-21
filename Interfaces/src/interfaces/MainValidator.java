package interfaces;

import interfaces.valid.Valid;


public class MainValidator {
    public static void main(String[] args) {
        Validator validProperty = new Valid();
        String propertyName = "vaishnavi";
        if (validProperty.isValid(propertyName))
            System.out.println(propertyName + " is a valid name");
        else
            System.out.println(propertyName + " is an invalid name");

        Validator validNumber = new ValidMobileNumber();
        String phoneNumber = "9588645494";
        if (validNumber.isValid(phoneNumber))
            System.out.println(phoneNumber + " is a valid phone number");
        else
            System.out.println(phoneNumber + " is an invalid phone number");

        Validator validEmail = new ValidEmail();
        String emailAddress = "vaishusonawane30@gmail.com";
        if (validEmail.isValid(emailAddress))
            System.out.println(emailAddress + " is a valid email address");
        else
            System.out.println(emailAddress + " is an invalid email address");

        Validator validAge = new ValidAge();
        String age = "18";
        if (validAge.isValid(age))
            System.out.println("Age " + age + " is valid for voting");
        else
            System.out.println("Age " + age + " is not valid for voting");
    }
}

