package com.soumission.soumission.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Soumission")
public class Soumission {


    @Id
    private String soumissionId ;

    public int isAccepted() {
        return isAccepted;
    }

    public Soumission(String soumissionId, int isAccepted, int fournisseurId, int offreId, String soumissionInfo) {
        this.soumissionId = soumissionId;
        this.isAccepted = isAccepted;
        this.fournisseurId = fournisseurId;
        this.offreId = offreId;
        this.soumissionInfo = soumissionInfo;
    }
    private int isAccepted=-1;

//    public String getSoumissionId() {
//        return soumissionId;
//    }

    public int getIsAccepted() {
        return isAccepted;
    }

    public Soumission() {
    }

    public void setAccepted(int accepted) {
        isAccepted = accepted;
    }

    private int fournisseurId;
    private int offreId;

    public String getId() {
        return soumissionId ;
    }

    public void setId(String id) {
        this.soumissionId  = id;
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
