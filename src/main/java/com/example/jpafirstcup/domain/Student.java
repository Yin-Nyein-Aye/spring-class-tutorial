package com.example.jpafirstcup.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Student_name",unique = true)
    private String name;
    private LocalDate dateOfBirht;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Student() {
    }

    public Student(String name, LocalDate dateOfBirht, Gender gender) {
        this.name = name;
        this.dateOfBirht = dateOfBirht;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirht() {
        return dateOfBirht;
    }

    public void setDateOfBirht(LocalDate dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
