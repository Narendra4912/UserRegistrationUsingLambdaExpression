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
            String firstName = "Abc";
            UserValidation user = new UserValidation();
            boolean actualResult = user.userValidateFirstName.validate(firstName);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG);
        }

    }
}
