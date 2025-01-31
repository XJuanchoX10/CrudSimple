package com.crudsimple.CrudSimple.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String firstName;
    private String LastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;
}
