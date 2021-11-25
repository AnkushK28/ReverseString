package com.perennial.reversestring.Entity;

public class String
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public java.lang.String toString() {
        return "String{" +
                "name=" + name +
                '}';
    }

    public String(String name) {
        this.name = name;
    }
    public String()
    {

    }
}
