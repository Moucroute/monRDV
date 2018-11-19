package monRDV.model;

public class Motif {
	
	private Long id;
	private Integer version;
	private String libelle;
	
	public Motif() {
		super();
	}
	
	public Motif(Long id, Integer version, String libelle) {
		super();
		this.id = id;
		this.version = version;
		this.libelle = libelle;
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
