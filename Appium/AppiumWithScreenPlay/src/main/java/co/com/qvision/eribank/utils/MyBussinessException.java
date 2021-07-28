package co.com.qvision.eribank.utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.exceptions.SerenityManagedException;

public class MyBussinessException extends SerenityManagedException {

    public MyBussinessException(String message, Throwable testErrorException)
    {
        super(message,testErrorException);
    }
}
