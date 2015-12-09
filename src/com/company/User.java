package com.company;

/**
 * Created by Vitaliy on 11/24/2015.
 */
public class User {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "'type any text here' @ User.toString fn {" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
