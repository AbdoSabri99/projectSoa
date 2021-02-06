package com.motif.motif.repository;

import com.motif.motif.model.Motif;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;


@Component
public interface MotifRepository extends MongoRepository<Motif,String> {
    //Motif findByUserId(int id);

    void deleteById(String id);

    boolean existsById(String id);
}
