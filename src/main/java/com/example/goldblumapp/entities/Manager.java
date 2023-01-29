package com.example.goldblumapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name="manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String LastName;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="department_id", referencedColumnName = "id")
    private Department department;

    public Manager(){}

    public Manager(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        LastName = lastName;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", department=" + department +
                '}';
    }
}
