package com.example.retrofittestingcallapi.model;

public class User {

    private String gender;
    private NameModel name;
    private LocationModel location;
    private String email;
    private String password;
    private String dob;
    private String phone;
    private String picture;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NameModel getName() {
        return name;
    }

    public LocationModel getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public String getPicture() {
        return picture;
    }
}
