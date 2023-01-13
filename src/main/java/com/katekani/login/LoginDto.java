package com.katekani.login;

import com.katekani.*;
import com.univocity.parsers.annotations.Parsed;

public class LoginDto extends com.katekani.TestCaseDto {
    @Parsed(field = "userName", defaultNullRead = "")
    private String userName;

    @Parsed(field = "password", defaultNullRead = "")
    private String password;

    @Parsed(field = "errorMessage", defaultNullRead = "")
    private String errorMessage;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
