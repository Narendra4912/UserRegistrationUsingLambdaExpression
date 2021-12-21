package com.blz.LamdaExpressionService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    String firstName, lastName, email, mobileNo, password;
    String message;

//    public boolean validUserFirstName (String firstName) throws CustomEmailException {
//        this.firstName = firstName;
//        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
//        Pattern pattern = Pattern.compile(userRegex);
//        Matcher matcher = pattern.matcher(firstName);
//
//        if(matcher.matches())
//            return true;
//        else
//        {
//            throw new CustomEmailException("FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG");
//        }
//    }

//    public UserValidationInterface validUserFirstName = () -> {
//        this.firstName = firstName;
//        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
//        Pattern pattern = Pattern.compile(userRegex);
//        Matcher matcher = pattern.matcher(firstName);
//
//    };

    public UserValidationInterface userValidateFirstName = (firstName) -> {

        this.firstName = firstName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches())
        {
            return true;
        }
        else
        {
            throw new CustomEmailException(CustomEmailException.ExceptionType.FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG);
        }
    };

}
