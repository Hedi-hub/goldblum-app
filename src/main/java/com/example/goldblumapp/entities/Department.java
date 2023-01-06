package com.example.goldblumapp.entities;

import com.example.goldblumapp.entities.Candidate;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String departmentTitle;

    @OneToMany(mappedBy = "department")
    private Set<Candidate> candidates;

    @OneToOne(mappedBy = "department")
    private Manager manager;

    public Department(){}

    public Department (String departmentTitle){
        this.departmentTitle = departmentTitle;
        this.candidates= new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentTitle='" + departmentTitle + '\'' +
                ", candidates=" + candidates +
                ", manager=" + manager +
                '}';
    }
}
