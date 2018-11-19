package monRDV.model;

import java.util.ArrayList;
import java.util.List;

public class RendezVous {
	
	private Long id;
	private int version;
	
	private Utilisateur utilisateur;
	private Patient patient;
	private Modalite modalite;
	
	private List<CreneauDisponible> rendezVous = new ArrayList<CreneauDisponible>();
	
	

	public RendezVous() {
		super();
	}

	public RendezVous(Long id, int version, Utilisateur utilisateur, Patient patient, Modalite modalite,
			List<CreneauDisponible> rendezVous) {
		super();
		this.id = id;
		this.version = version;
		this.utilisateur = utilisateur;
		this.patient = patient;
		this.modalite = modalite;
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Modalite getModalite() {
		return modalite;
	}

	public void setModalite(Modalite modalite) {
		this.modalite = modalite;
	}

	public List<CreneauDisponible> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<CreneauDisponible> rendezVous) {
		this.rendezVous = rendezVous;
	}
	
	
	
	
	
	
	

}
