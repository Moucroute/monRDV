package monRDV.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Version
	private int version;
	private Boolean defaut;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Date dateCreation;
	
	private Utilisateur utilisateur;
	private List<RendezVous> listRendezVous = new ArrayList<RendezVous>();
	

	public Patient() {
		super();
	}

	public Patient(Long id, int version, Boolean defaut, String nom, String prenom, Date dateNaissance,
			Date dateCreation, Utilisateur utilisateur, List<RendezVous> listRendezVous) {
		super();
		this.id = id;
		this.version = version;
		this.defaut = defaut;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateCreation = dateCreation;
		this.utilisateur = utilisateur;
		this.listRendezVous = listRendezVous;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Boolean getDefaut() {
		return defaut;
	}
	public void setDefaut(Boolean defaut) {
		this.defaut = defaut;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<RendezVous> getListRendezVous() {
		return listRendezVous;
	}
	public void setListRendezVous(List<RendezVous> listRendezVous) {
		this.listRendezVous = listRendezVous;
	}
	
	
}
