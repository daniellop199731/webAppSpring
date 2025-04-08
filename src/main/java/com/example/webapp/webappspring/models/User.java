package com.example.webapp.webappspring.models;

public class User {

    private String userName;
    private String userLastname;

    public User(String userName, String userLastname) {
        this.userName = userName;
        this.userLastname = userLastname;
    }    

    public User() {}

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserLastname() {
        return userLastname;
    }
    public void setUserLastName(String userLastname) {
        this.userLastname = userLastname;
    }

    

}
