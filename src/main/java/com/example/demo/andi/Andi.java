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


    public Andi() {
    }

    public String getAndiInformation() {
        return firstName + " " + lastName + ". Squad: " + squad + ". Level: " + level + ". Role: " + role + ".";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
