package monRDV.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "modalite")
public class Modalite {

	@Id
	@GeneratedValue
	@Column(name = "id", length = 100)
	private Long id;

	@Version
	private Integer version;

	@Column(name = "prix", length = 100)
	private Float prix;

	@Column(name = "duree", length = 100)
	private Long duree;

	@Column(name = "delai_annulation", length = 100)
	private Long delaiAnnulation;

	@Column(name = "depassement_honoraires", length = 100)
	private Boolean depassementHonoraires;

	private Praticien praticien;

	private List<RendezVous> rendezVous = new ArrayList<>();

	@OneToMany(mappedBy = "modalites")
	private Motif motif;

	public Modalite() {
		super();
	}

	public Modalite(Long id, Integer version, Float prix, Long duree, Long delaiAnnulation,
			Boolean depassementHonoraires) {
		super();
		this.id = id;
		this.version = version;
		this.prix = prix;
		this.duree = duree;
		this.delaiAnnulation = delaiAnnulation;
		this.depassementHonoraires = depassementHonoraires;
	}

	public Modalite(Long id, Integer version, Float prix, Long duree, Long delaiAnnulation,
			Boolean depassementHonoraires, Praticien praticien, List<RendezVous> rendezVous, Motif motif) {
		super();
		this.id = id;
		this.version = version;
		this.prix = prix;
		this.duree = duree;
		this.delaiAnnulation = delaiAnnulation;
		this.depassementHonoraires = depassementHonoraires;
		this.praticien = praticien;
		this.rendezVous = rendezVous;
		this.motif = motif;
	}

	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
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

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public Long getDuree() {
		return duree;
	}

	public void setDuree(Long duree) {
		this.duree = duree;
	}

	public Long getDelaiAnnulation() {
		return delaiAnnulation;
	}

	public void setDelaiAnnulation(Long delaiAnnulation) {
		this.delaiAnnulation = delaiAnnulation;
	}

	public Boolean getDepassementHonoraires() {
		return depassementHonoraires;
	}

	public void setDepassementHonoraires(Boolean depassementHonoraires) {
		this.depassementHonoraires = depassementHonoraires;
	}

}
