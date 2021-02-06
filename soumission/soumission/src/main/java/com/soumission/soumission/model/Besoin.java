package com.soumission.soumission.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Besoin")
public class Besoin {
    @Id
    private int id;
    private String name;
    private Boolean estPrisEncharge;

}
