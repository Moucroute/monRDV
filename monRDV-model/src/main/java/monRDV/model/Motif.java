package monRDV.model;

import java.util.ArrayList;
import java.util.List;

public class Motif {
	
	private Long id;
	
	private Integer version;
	
	private String libelle;
	
	private Specialite specialite;
	
	private List<Modalite> modalites = new ArrayList<>();
	
	
	public Motif() {
		super();
	}
	
	public Motif(Long id, Integer version, String libelle) {
		super();
		this.id = id;
		this.version = version;
		this.libelle = libelle;
	}

	public Motif(Long id, Integer version, String libelle, Specialite specialite, List<Modalite> modalites) {
		super();
		this.id = id;
		this.version = version;
		this.libelle = libelle;
		this.specialite = specialite;
		this.modalites = modalites;
	}

	public Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}

	public List<Modalite> getModalites() {
		return modalites;
	}

	public void setModalites(List<Modalite> modalites) {
		this.modalites = modalites;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
