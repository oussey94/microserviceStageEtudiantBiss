package com.mbodjiousseynou.StagesEtudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mbodjiousseynou.StagesEtudiant.entities.Stage;
@RepositoryRestResource
public interface StagesEtudiantRepository extends JpaRepository<Stage, Long> {

}
