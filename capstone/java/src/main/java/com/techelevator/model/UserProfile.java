package com.techelevator.model;

public class UserProfile {

    private int userId;
    private String username;
    private String cyclingTeam;
    private double userWeight;
    private int userAge;
    private String photo;

    public UserProfile(){}

    public UserProfile(int id) {
        this.userId = id;
    }

    public UserProfile(int id, String username, String cyclingTeam, double userWeight, int userAge, String photo) {
        this.userId = id;
        this.username = username;
        this.cyclingTeam = cyclingTeam;
        this.userWeight = userWeight;
        this.userAge = userAge;
        this.photo = photo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCyclingTeam() {
        return cyclingTeam;
    }

    public void setCyclingTeam(String cyclingTeam) {
        this.cyclingTeam = cyclingTeam;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
