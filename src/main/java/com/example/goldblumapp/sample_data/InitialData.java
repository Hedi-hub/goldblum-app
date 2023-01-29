package com.example.goldblumapp.sample_data;

import com.example.goldblumapp.entities.Candidate;
import com.example.goldblumapp.entities.Department;
import com.example.goldblumapp.entities.Manager;
import com.example.goldblumapp.services.CandidateService;
import com.example.goldblumapp.services.DepartmentService;
import com.example.goldblumapp.services.ManagerService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialData {

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private DepartmentService departmentService;



    @PostConstruct
    public void initializeDatabase(){

        Department department = new Department("IT Department");
        Manager manager = new Manager("Fredrick", "Himperich",department);
        Candidate candidate = new Candidate("Ansgar", "Bittermann","a.bittermann@@goldblume-cosulting.com",
                "Male","015751301441","Berater","München",department);

        departmentService.saveDepartment(department);
        candidateService.saveCandidate(candidate);
        managerService.saveManager(manager);
    }
}
