package com.example.demo.andi;

import jakarta.persistence.*;

@Entity
@Table(name = "andisdemoproject")
public class Andi {
    @Id
    @SequenceGenerator(
            name = "andisdemoproject_sequence",
            sequenceName = "andisdemoproject_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "andisdemoproject _sequence"
    )
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String squad;
    private double level;
    private String role;

    public String getEmail() {
        return email;
    }

    public Andi(Integer id, String email, String firstName, String lastName, String squad, double level, String role) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.squad = squad;
        this.level = level;
        this.role = role;
    }

    public Andi(String email, String firstName, String lastName, String squad, double level, String role) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.squad = squad;
        this.level = level;
        this.role = role;
    }


    public Andi() {
    }

    public String getAndiInformation() {
        return firstName + " " + lastName + " Email: " + email + ". Squad: " + squad + ". Level: " + level + ". Role: " + role + ".";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSquad() {
        return squad;
    }

    public double getLevel() {
        return level;
    }

    public String getRole() {
        return role;
    }
}
