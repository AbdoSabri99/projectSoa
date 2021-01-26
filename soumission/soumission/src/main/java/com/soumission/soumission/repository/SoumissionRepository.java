package com.soumission.soumission.repository;

import com.soumission.soumission.model.Soumission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface SoumissionRepository extends MongoRepository<Soumission,String> {

    void deleteById(String id);
}

