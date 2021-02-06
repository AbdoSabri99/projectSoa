package com.soumission.soumission.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.soumission.soumission.model.Fournisseur;
import com.soumission.soumission.model.Soumission;
import com.soumission.soumission.service.FournisseurProxy;
import com.soumission.soumission.service.SoumissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/soumission")
public class SoumissionController {
    @Autowired
    private SoumissionService soumissionService;
    @Autowired
    private  RestTemplate restTemplate;
    @Autowired
    private FournisseurProxy fournisseurProxy;
    //for a resposible resources
    @GetMapping("/get")
    public List<Soumission>getAll(){
        return soumissionService.getAllSoumission();
    }
    //CREATE A NEW SOUMISSION :FOR A FOURNISSEUR
    @PostMapping("/soumettre")
    public String createSoumission(@RequestBody Soumission soumission){
        //AppelOffre appelOffre=restTemplate.getForObject("http://appel-offre-service/getAllAppelOffre/"+soumission.getOffreId(), AppelOffre.class);
         //add a new rest template to call fournisseur service
       // Fournisseur fournisseur=restTemplate.getForObject("http://FOURNISSEUR-SERVICE/findFournisseur/"+soumission.getFournisseurId(), Fournisseur.class);
        Fournisseur fournisseur=fournisseurProxy.getFournisseur(soumission.getFournisseurId());
        /*if(appelOffre!=null && fournisseur!=null)
             return "la soumission bien enregistré";*/
       if(fournisseur==null)
            return ("s'inscrire pour faire votre soumission");
       else if(fournisseur.getId()==-1){
           return "le service en panne, un peu de patience svp!";
       }
       else {
           soumissionService.createSoumission(soumission);
           return ("votre soumission a été bien enregistré ");
       }

    }
    @GetMapping("/{id}")
    public Soumission getByid(@PathVariable("id") String id)
    {
        Soumission soumission = soumissionService.findSoumissionById(id);

        return soumissionService.findSoumissionById(id);
    }
    @GetMapping("/{isAccepted}/{id}")
    public boolean  setIsAccepted(@PathVariable int isAccepted,@PathVariable String id) {
        Soumission soumission=soumissionService.findSoumissionById(id);
        soumission.setAccepted(isAccepted);
       if (soumissionService.createSoumission(soumission)!=null)
            return true;
       else
           return false;
    }
    //DELETE A SOUMISSION BY ID
    @GetMapping("delete/{id}")
    public void deleteSoumission(@PathVariable String id){
        soumissionService.deleteSoumission(id);
    }

}

