package com.motif.motif.controller;


import com.motif.motif.model.Motif;
import com.motif.motif.service.MotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{userid}")
    public Motif getMotifById(@PathVariable final int userid){
                return motifservice.findMotifUserId(userid);
    }
    @PostMapping("/")
    public void createMotif(@RequestBody Motif motif)
    {
        motifservice.Save(motif);
    }
    @DeleteMapping("/{id}")
    public  void deleteMotif(@PathVariable int id)
    {
         motifservice.deleteById(id);
    }


}
