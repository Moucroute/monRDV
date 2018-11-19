package monRDV.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "lieu")
public class Lieu {
	@Id
	@GeneratedValue
	private Long id;
	private int version;
	private String nom;
	@Embedded
	private Adresse adresse;
	@OneToMany
    @JoinTable(name = "lieu_praticien", joinColumns = @JoinColumn(name = "lieu_id"), inverseJoinColumns = @JoinColumn(name = "praticien_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
            "lieu_id", "praticien_id" }))
	private Praticien praticien;

	@OneToMany(mappedBy = "lieu")
	private List<CreneauDisponible> creneaux = new ArrayList<CreneauDisponible>();

	public Lieu() {
		super();
	}
	
	

	public Lieu(String nom, List<CreneauDisponible> creneauxDisponibles) {
		this.nom = nom;
		this.creneauxDisponibles = creneauxDisponibles;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<CreneauDisponible> getCreneauxDisponibles() {
		return creneaux;
	}

	public void setCreneauxDisponibles(List<CreneauDisponible> creneauxDisponibles) {
		this.creneaux = creneauxDisponibles;
	}

}
