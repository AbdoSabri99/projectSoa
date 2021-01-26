package com.soumission.soumission.service;

import com.soumission.soumission.model.Soumission;
import com.soumission.soumission.repository.SoumissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoumissionService {
    @Autowired
    private SoumissionRepository soumissionRepository;
    public List<Soumission> getAllSoumission(){
        return  soumissionRepository.findAll();
    }
    public Soumission createSoumission(Soumission soumission){
        return soumissionRepository.save(soumission);
    }
    public  void deleteSoumission(String id){
        soumissionRepository.deleteById(id);
    }

}
