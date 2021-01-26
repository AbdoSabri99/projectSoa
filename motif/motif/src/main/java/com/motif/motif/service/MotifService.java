package com.motif.motif.service;

import com.motif.motif.model.Motif;
import com.motif.motif.repository.MotifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class MotifService {
    //private List<Motif> motifs = new ArrayList<>(Arrays.asList());
    @Autowired
    private MotifRepository motifRepository;


    public List<Motif> findAll() {
        return motifRepository.findAll();
    }

    public Motif findMotifUserId(int id) {
        return motifRepository.findByUserId(id);
    }

    public Motif Save(Motif motif) {
        return  motifRepository.save(motif);
    }

    public void deleteById(String id) {
        motifRepository.deleteById(id);
    }
    //function to check if a user have a motif;i will complete it if need
    public boolean userHaveMotif(String id){
        return  motifRepository.existsById(id);
    }
}
