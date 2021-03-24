package com.mbodjiousseynou.StagesEtudiant.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mbodjiousseynou.StagesEtudiant.model.Etudiant;

@FeignClient(name = "INSCRIPTION-ETUDIANT")
public interface StagesEtudiantRestClient {
	@GetMapping(path = "/etudiants/{id}")
	public Etudiant getEtudiantById(@PathVariable(name="id") Long id);

}
