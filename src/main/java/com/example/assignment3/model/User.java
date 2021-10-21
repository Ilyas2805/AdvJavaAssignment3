package com.example.assignment3.model;

import lombok.Data;

import javax.persistence.*;

@Data// anotation which by default makes getter, setters and method to string
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
