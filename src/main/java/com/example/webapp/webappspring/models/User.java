package com.example.webapp.webappspring.models;

public class User {

    private String userName;
    private String userLastname;
    private String userEmail;

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
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    

}
