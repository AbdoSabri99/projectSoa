package com.soumission.soumission.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.soumission.soumission.model.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FournisseurProxy {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod="getFallBackFournisseur",commandProperties ={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000"),
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="58"),
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="5000"),
    })
    public Fournisseur getFournisseur(int id){
        Fournisseur fournisseur=restTemplate.getForObject("http://FOURNISSEUR-SERVICE/findFournisseur/"+id, Fournisseur.class);
        return fournisseur;
    }
   public Fournisseur getFallBackFournisseur(int id){
        Fournisseur fournisseur=new Fournisseur(-1,"","","","","");
        return fournisseur;

   }

}
