package com.soumission.soumission.repository;

import com.soumission.soumission.model.Soumission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SoumissionRepository extends JpaRepository<Soumission,Integer> {

}

