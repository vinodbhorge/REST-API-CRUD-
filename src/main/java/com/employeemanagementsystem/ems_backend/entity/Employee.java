package com.employeemanagementsystem.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name") // Changed column name format
    private String firstName;

    @Column(name = "last_name") // Changed column name format
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}
