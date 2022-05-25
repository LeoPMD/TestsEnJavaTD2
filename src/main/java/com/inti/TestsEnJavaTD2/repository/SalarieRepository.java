package com.inti.TestsEnJavaTD2.repository;

import com.inti.TestsEnJavaTD2.model.Salarie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // @Componant
public interface SalarieRepository extends JpaRepository<Salarie, Integer> {

}
