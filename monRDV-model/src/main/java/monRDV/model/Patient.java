package monRDV.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
@Table(name = "patient")
public class Patient {
	

	@Id
	@GeneratedValue
	private Long id;
	
	@Version
	private int version;
	public Patient(Boolean defaut, String nom, String prenom, Date dateNaissance, Date dateCreation,
			Utilisateur utilisateur, List<RendezVous> rendezVous) {
		super();
		this.defaut = defaut;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateCreation = dateCreation;
		this.utilisateur = utilisateur;
		this.rendezVous = rendezVous;
	}
	private Boolean defaut;
	private String nom;
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_naissance")
	private Date dateNaissance;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_creation")
	private Date dateCreation;
	
	@ManyToOne
	@JoinColumn(name="utilisateur_id")
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy = "patient")
	private List<RendezVous> rendezVous = new ArrayList<RendezVous>();
	

	public Patient() {
		super();
	}
	
	public Patient(Boolean defaut, String nom, String prenom, Date dateNaissance,
			Date dateCreation, Utilisateur utilisateur, List<RendezVous> rendezVous) {
		super();
		this.defaut = defaut;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateCreation = dateCreation;
		this.utilisateur = utilisateur;
		this.rendezVous = rendezVous;
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

	public List<RendezVous> getrendezVous() {
		return rendezVous;
	}
	public void setListRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}
	
	
}
