package com.example.goldblumapp.services;

import com.example.goldblumapp.entities.Candidate;
import com.example.goldblumapp.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public void saveCandidate(Candidate candidate){
        candidateRepository.save(candidate);
    }
    public void removeCandidate(Candidate candidate){
        candidateRepository.delete(candidate);
    }
    public List<Candidate>getAllCandidates(){
        return candidateRepository.findAll();
    }
    public Candidate findCandidateById(int id){
        return candidateRepository.findById(id).get();
    }
}
