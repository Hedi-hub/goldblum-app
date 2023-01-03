package com.example.goldblumapp;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    private String Tel;
    private String office;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(firstName, candidate.firstName) && Objects.equals(lastName, candidate.lastName) && Objects.equals(email, candidate.email) && Objects.equals(gender, candidate.gender) && Objects.equals(Tel, candidate.Tel) && Objects.equals(office, candidate.office);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, gender, Tel, office);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", Tel='" + Tel + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
