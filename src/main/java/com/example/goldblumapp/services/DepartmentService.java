package com.example.goldblumapp.services;

import com.example.goldblumapp.entities.Department;
import com.example.goldblumapp.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveDepartment(Department department){
        departmentRepository.save(department);
    }
    public void removeDepartment(Department department){
        departmentRepository.delete(department);
    }
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();

    }
    public Department findDepartmentById(int id){
        return departmentRepository.findById(id).get();
    }
}
