package com.example.demo.andi;

public class Andi {
    private Integer id;

    private String firstName;

    private String lastName;

    private String squad;

    private double level;

    private String role;

    public Andi(Integer id, String firstName, String lastName, String squad, double level, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.squad = squad;
        this.level = level;
        this.role = role;
    }

    public Andi(String firstName, String lastName, String squad, double level, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.squad = squad;
        this.level = level;
        this.role = role;
    }


    public String getAndiInformation() {
        return firstName + " " + lastName + ". Squad: " + squad + ". Level: " + level + ". Role: " + role + ".";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
