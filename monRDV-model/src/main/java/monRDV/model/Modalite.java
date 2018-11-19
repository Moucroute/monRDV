package monRDV.model;

public class Modalite {
	
	private Long id;
	private Integer version;
	private Float prix;
	private Long duree;
	private Long delaiAnnulation;
	private Boolean depassementHonoraires;
	
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
