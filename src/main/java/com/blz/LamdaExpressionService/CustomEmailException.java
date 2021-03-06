package com.blz.LamdaExpressionService;

public class CustomEmailException extends Exception{

    public ExceptionType exceptionMessage;

    public CustomEmailException(ExceptionType message) {
        this.exceptionMessage = message;
    }

    public enum ExceptionType
    {
        FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG,
        LASTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG,
        EMAIL_ID_IS_IN_INCORRECT_FORMAT,
        MINIMUM_8_DIGITS_PASSWORD_WITH_AT_LEAST_ONE_CAPITAL_LETTER_AND_AT_LEAST_ONE_NUMERIC_LETTER_AND_EXACT_ONE_SPECIAL_SYMBOL,
        MOBILE_NO_MUST_BE_IN_FORMAT_COUNTRY_CODE_SPACE_MOBILE_NO
    }
}