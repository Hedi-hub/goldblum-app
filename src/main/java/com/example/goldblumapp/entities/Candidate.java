package com.example.goldblumapp.entities;

import jakarta.persistence.*;

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

    private String jobTitle;
    private String officeAddress;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;


public Candidate(){
    super();
}

    public Candidate(String firstName, String lastName, String email, String gender, String tel, String jobTitle, String officeAddress, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.Tel = tel;
        this.jobTitle = jobTitle;
        this.officeAddress = officeAddress;
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
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

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", Tel='" + Tel + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", department=" + department +
                '}';
    }

}
