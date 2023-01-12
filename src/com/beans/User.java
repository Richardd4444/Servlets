package com.beans;

public class User {
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String activity;

    public User(String username, String password, String firstName, String lastName, int age, String activity) {
        this.password = password;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.activity = activity;
    }
    public User(){
        // TODO Auto-generated constructor stub
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getActivity() {
        return activity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
