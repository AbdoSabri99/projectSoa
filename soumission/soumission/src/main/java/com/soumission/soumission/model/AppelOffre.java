package com.soumission.soumission.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@Document(collection="AppelOffre")
public class AppelOffre {
    @Id
    private int id;
    private String name;
    private List<Besoin> listbesoin;
}
