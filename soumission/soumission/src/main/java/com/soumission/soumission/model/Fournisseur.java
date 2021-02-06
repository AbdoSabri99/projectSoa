package com.soumission.soumission.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "fournisseur")
public class Fournisseur {
    @Id @Generated
    private int id;
    @NonNull
    @Indexed(unique = true)
    private String Username;
    @NonNull
    private String Nom;
    @NonNull
    private String Adresse;
    @NonNull
    private String Tel;
    @NonNull
    private String Mdp;

    public Fournisseur() {
    }

    public Fournisseur(int id, String username, String nom, String adresse, String tel, String mdp) {
        this.id = id;
        Username = username;
        Nom = nom;
        Adresse = adresse;
        Tel = tel;
        Mdp = mdp;
    }

    public String getNom() {
        return Nom;
    }

    public int getId() {
        return id;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getTel() {
        return Tel;
    }

    public String getUsername() {
        return Username;
    }

    public String getMdp() {
        return Mdp;
    }
}
