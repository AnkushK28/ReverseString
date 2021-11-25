package com.perennial.reversestring.bean;

import javax.validation.constraints.NotNull;

public class ReverseString
{
    public ReverseString(String str) {
        this.str = str;
    }

    public ReverseString()
    {

    }

    @NotNull(message = "invalid input")
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
