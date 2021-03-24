package com.mbodjiousseynou.StagesEtudiant.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.mbodjiousseynou.StagesEtudiant.model.Etudiant;
@Entity
public class Stage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String NomEntreprise;
	private Long etudiantID;
	@Transient
	private Etudiant etudiant;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomEntreprise() {
		return NomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		NomEntreprise = nomEntreprise;
	}
	public Long getEtudiantID() {
		return etudiantID;
	}
	public void setEtudiantID(Long etudiantID) {
		this.etudiantID = etudiantID;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stage(Long id, String nomEntreprise, Long etudiantID) {
		super();
		this.id = id;
		NomEntreprise = nomEntreprise;
		this.etudiantID = etudiantID;
	}
	@Override
	public String toString() {
		return "Stage [id=" + id + ", NomEntreprise=" + NomEntreprise + ", etudiantID=" + etudiantID + "]";
	}
	

}
