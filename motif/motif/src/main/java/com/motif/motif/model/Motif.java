package com.motif.motif.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Motif {
    @Id @GeneratedValue
    private  int id;
    private  int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return userId;
    }

    public void setId_user(int userId ) {
        this.userId = userId ;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private  String desc;
}
