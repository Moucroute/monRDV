package monRDV.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Praticien {

	@Id
	@GeneratedValue
	private long id;
	private Integer version;
	private String nom;
	private String prenom;
	private boolean prendCarteVitale;
	private boolean validationAuto;
	private List<Specialite> specialite = new ArrayList<>();
	private List<Lieu> lieux = new ArrayList<>();
	private List<Modalite> modalites = new ArrayList<>();
	private List<CreneauDisponible> creneauDisponibles = new ArrayList<>();
	private Utilisateur utilisateur;

	public Praticien() {
		super();
	}

	public List<Specialite> getSpecialite() {
		return specialite;
	}

	public void setSpecialite(List<Specialite> specialite) {
		this.specialite = specialite;
	}

	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	public List<Modalite> getModalites() {
		return modalites;
	}

	public void setModalites(List<Modalite> modalites) {
		this.modalites = modalites;
	}

	public List<CreneauDisponible> getCreneauDisponibles() {
		return creneauDisponibles;
	}

	public void setCreneauDisponibles(List<CreneauDisponible> creneauDisponibles) {
		this.creneauDisponibles = creneauDisponibles;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	public boolean isPrendCarteVitale() {
		return prendCarteVitale;
	}

	public void setPrendCarteVitale(boolean prendCarteVitale) {
		this.prendCarteVitale = prendCarteVitale;
	}

	public boolean isValidationAuto() {
		return validationAuto;
	}

	public void setValidationAuto(boolean validationAuto) {
		this.validationAuto = validationAuto;
	}

}
