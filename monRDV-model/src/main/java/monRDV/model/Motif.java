package monRDV.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

public class Motif {

	@Id
	@GeneratedValue
	@Column(name = "id", length = 100)
	private Long id;

	@Version
	private Integer version;

	@Column(name = "libelle", length = 100)
	private String libelle;

	@ManyToOne
	private Specialite specialite;

	@OneToMany
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
