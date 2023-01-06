package com.example.goldblumapp.services;


import com.example.goldblumapp.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.goldblumapp.entities.Manager;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public void saveManager(Manager manager){
        managerRepository.save(manager);
    }

    public void removeManager(Manager manager){
        managerRepository.delete(manager);
    }

    public List<Manager> getAllManagers(){
        return managerRepository.findAll();
    }

    public Manager findManagerById(int id){
        return managerRepository.findById(id).get();
    }

}
