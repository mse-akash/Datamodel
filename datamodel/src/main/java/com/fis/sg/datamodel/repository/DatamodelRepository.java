package com.fis.sg.datamodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.sg.datamodel.entity.Datamodel;

@Repository
public interface DatamodelRepository extends JpaRepository<Datamodel, Long> {

}
