package com.katekani.cart;

import com.katekani.TestCaseDto;
import com.univocity.parsers.annotations.Parsed;

public class CartDto extends TestCaseDto {
    @Parsed(field = "userName", defaultNullRead = "")
    private String userName;

    @Parsed(field = "password", defaultNullRead = "")
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
