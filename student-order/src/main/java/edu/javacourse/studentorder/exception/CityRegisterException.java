package edu.javacourse.studentorder.exception;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class CityRegisterException extends Exception{

    private String code;

    public CityRegisterException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CityRegisterException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
