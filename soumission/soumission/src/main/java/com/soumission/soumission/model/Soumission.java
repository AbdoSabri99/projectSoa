package com.soumission.soumission.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Soumission")
public class Soumission {
    @Id
    private String id;


    private int fournisseurId;
    private int offreId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOffreId() {
        return offreId;
    }

    public void setOffreId(int offreId) {
        this.offreId = offreId;
    }

    public String getSoumissionInfo() {
        return soumissionInfo;
    }

    public void setSoumissionInfo(String soumissionInfo) {
        this.soumissionInfo = soumissionInfo;
    }

    private String soumissionInfo;

    public int getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

}
