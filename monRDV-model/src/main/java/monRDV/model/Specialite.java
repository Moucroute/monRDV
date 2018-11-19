package monRDV.model;

import javax.persistence.Version;
import java.util.ArrayList;
import java.util.List;

public class Specialite {

	private Long id;
	@Version
	private int version;
	private String libelle;
	private List<Praticien> praticien = new ArrayList<>();
	private List<Motif> motif = new ArrayList<>();

	public Specialite() {
		super();
	}

	public List<Praticien> getPraticien() {
		return praticien;
	}

	public void setPraticien(List<Praticien> praticien) {
		this.praticien = praticien;
	}

	public List<Motif> getMotif() {
		return motif;
	}

	public void setMotif(List<Motif> motif) {
		this.motif = motif;
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
