package com.motif.motif.repository;

import com.motif.motif.model.Motif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface MotifRepository extends JpaRepository<Motif,Integer> {

    Motif findByUserId(int id);
}
