package com.soumission.soumission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Soumission {
    @Id @GeneratedValue
    private int id;


    private int fournisseurId;
    private int offreId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
