package com.blz.LamdaExpressionService;

@FunctionalInterface
public interface UserValidationInterface {

    public boolean validate(String str) throws CustomEmailException;

}
