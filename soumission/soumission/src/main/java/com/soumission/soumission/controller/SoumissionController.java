package com.soumission.soumission.controller;

import com.soumission.soumission.model.Soumission;
import com.soumission.soumission.service.SoumissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soumission")
public class SoumissionController {
    @Autowired
    private SoumissionService soumissionService;
    //for a resposible resources
    @GetMapping("/get")
    public List<Soumission>getAll(){
        return soumissionService.getAllSoumission();
    }
    //CREATE A NEW SOUMISSION :FOR A FOURNISSEUR
    @PostMapping("/soumettre")
    public Soumission createSoumission(@RequestBody Soumission soumission){
        return soumissionService.createSoumission(soumission);

    }
    //DELETE A SOUMISSION BY ID
    @GetMapping("delete/{id}")
    public void deleteSoumission(@PathVariable String id){
        soumissionService.deleteSoumission(id);
    }
    //here get all appel offre for display them to the fournisseur
    //@GetMapping("/")
    /*public Offre getAllOffre(){
        return ;
    }*/
}

