package com.motif.motif.controller;


import com.motif.motif.model.Motif;
import com.motif.motif.service.MotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/motif")
public class MotifController {
    @Autowired
    private MotifService motifservice;
    @GetMapping("/")
    public List<Motif> getMotif(){
          return motifservice.findAll();
    }
    /*@GetMapping("/{userid}")
    public Motif getMotifById(@PathVariable final int userid){
                return motifservice.findMotifUserId(userid);
    }*/
    @PostMapping("/")
    public String createMotif(@RequestBody Motif motif)
    {
        motifservice.Save(motif);
        return "votre motif a été bien enregistré ";
    }
    @DeleteMapping("/{id}")
    public  void deleteMotif(@PathVariable String id)
    {
         motifservice.deleteById(id);
    }

    @GetMapping("/havemotif/{userID}")
    public boolean getMotifByUserName(@PathVariable String userID){
        List<Motif> motifs = motifservice.findAll();
        for (Motif a:motifs){
            if (a.getUserName().equals(userID)){
                if(a.getDateFinMotif().isAfter(LocalDate.now())){
                    return true;
                }
            }
        }
        return false;
    }

}
