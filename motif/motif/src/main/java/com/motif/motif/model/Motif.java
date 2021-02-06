package com.motif.motif.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Document(collection = "Motif")
public class Motif {
    @Id
    private String id;

  //  private  int userId;
    private  String userName;

    public LocalDate getDateFinMotif() {
        return dateFinMotif;
    }

    public void setDateFinMotif(LocalDate dateFinMotif) {
        this.dateFinMotif = dateFinMotif;
    }
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateFinMotif;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

  /*  public int getId_user() {
        return userId;
    }

    public void setId_user(int userId ) {
        this.userId = userId ;
    }*/

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private  String desc;

}
