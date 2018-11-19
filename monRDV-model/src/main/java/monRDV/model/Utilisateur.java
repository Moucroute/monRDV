package monRDV.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utilisateur {
	
	private Long id;
	private int version;
	private String email;
	private String telephone;
	private Date dateCreation;
	private String motDePasse;
	private Profil profil;
	
	private List<Patient> patients = new ArrayList<Patient>();
	private List<RendezVous> rendezVous = new ArrayList<RendezVous>();
	
	private Praticien praticien;
	

	public Utilisateur() {
		super();
	}

	public Utilisateur(Long id, int version, String email, String telephone, Date dateCreation, String motDePasse,
			Profil profil, List<Patient> patients, List<RendezVous> rendezVous, Praticien praticien) {
		super();
		this.id = id;
		this.version = version;
		this.email = email;
		this.telephone = telephone;
		this.dateCreation = dateCreation;
		this.motDePasse = motDePasse;
		this.profil = profil;
		this.patients = patients;
		this.rendezVous = rendezVous;
		this.praticien = praticien;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public List<Patient> getListPatient() {
		return patients;
	}

	public void setListPatient(List<Patient> patients) {
		this.patients = patients;
	}

	public List<RendezVous> getrendezVous() {
		return rendezVous;
	}

	public void setListRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}
	
	
	
	
}
