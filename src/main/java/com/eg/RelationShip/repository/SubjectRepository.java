package com.eg.RelationShip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eg.RelationShip.entity.Subject;
import org.springframework.stereotype.Repository;



@Repository
public interface SubjectRepository  extends JpaRepository<Subject, Integer>{

}
