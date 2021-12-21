package com.blz.LambdaExpressionTest;

import com.blz.LamdaExpressionService.*;
import org.junit.Assert;
import org.junit.Test;


public class UserValidationTesting {

    private String message;

    @Test
    public void givenFirstNameShouldPassWhenFirstNameRulesSatisfied() {

        try
        {
            String firstName = "abc";
            UserValidation user = new UserValidation();
            boolean actualResult = user.userValidateFirstName.validate(firstName);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG);
            Assert.assertEquals(CustomEmailException.ExceptionType.FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG,e.exceptionMessage);
        }

    }

    @Test
    public void givenLastNameShouldPassWhenLastNameRulesSatisfied() {

        try
        {
            String lastName = "xyzd";
            UserValidation user = new UserValidation();
            boolean actualResult = user.userValidateLastName.validate(lastName);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.LASTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG);
            Assert.assertEquals(CustomEmailException.ExceptionType.LASTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG,e.exceptionMessage);
        }
    }

    @Test
    public void givenEmailShouldPassWhenEmailRulesSatisfied() {

        try
        {
            //Happy Email testing
            String email = "abc.xyz@domain.co.in";
            UserValidation user = new UserValidation();
            boolean actualResult = user.userValidateEmail.validate(email);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.EMAIL_ID_IS_IN_INCORRECT_FORMAT);
            Assert.assertEquals(CustomEmailException.ExceptionType.EMAIL_ID_IS_IN_INCORRECT_FORMAT,e.exceptionMessage);
        }
    }

    @Test
    public void givenMobileNoShouldPassWhenMobileNoRulesSatisfied() {

        try
        {
            String mobileNo = "91 9876543210";
            UserValidation user = new UserValidation();
            boolean actualResult = user.userValidateMobileNo.validate(mobileNo);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.MOBILE_NO_MUST_BE_IN_FORMAT_COUNTRY_CODE_SPACE_MOBILE_NO);
            Assert.assertEquals(CustomEmailException.ExceptionType.MOBILE_NO_MUST_BE_IN_FORMAT_COUNTRY_CODE_SPACE_MOBILE_NO,e.exceptionMessage);
        }
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordRulesSatisfied() {

        try
        {
            String password = "Abcd@1gh";
            UserValidation user = new UserValidation();
            boolean actualResult = user.userValidatePassword.validate(password);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.MINIMUM_8_DIGITS_PASSWORD_WITH_AT_LEAST_ONE_CAPITAL_LETTER_AND_AT_LEAST_ONE_NUMERIC_LETTER_AND_EXACT_ONE_SPECIAL_SYMBOL);
            Assert.assertEquals(CustomEmailException.ExceptionType.MINIMUM_8_DIGITS_PASSWORD_WITH_AT_LEAST_ONE_CAPITAL_LETTER_AND_AT_LEAST_ONE_NUMERIC_LETTER_AND_EXACT_ONE_SPECIAL_SYMBOL,e.exceptionMessage);
        }
    }
}
