package com.joeso.twowaydatabindingwithlivedata;

public class User {
    private String name;
    private String password;

    public String getName() {
        if (this.name==null) return "";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        if (this.password==null) return "";
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
