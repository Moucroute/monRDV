package monRDVTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import monRDV.dao.IDaoCreneauDisponible;
import monRDV.dao.IDaoModalite;
import monRDV.dao.IDaoMotif;
import monRDV.dao.IDaoPatient;
import monRDV.dao.IDaoRendezVous;
import monRDV.dao.IDaoSpecialite;
import monRDV.dao.IDaoUtilisateur;
import monRDV.dao.jpa.DaoCreneauDisponibleJpa;
import monRDV.dao.jpa.DaoModaliteJpa;
import monRDV.dao.jpa.DaoMotifJpa;
import monRDV.dao.jpa.DaoPatientJpa;
import monRDV.dao.jpa.DaoRendezVousJpa;
import monRDV.dao.jpa.DaoSpecialiteJpa;
import monRDV.dao.jpa.DaoUtilisateurJpa;
import monRDV.model.Adresse;
import monRDV.model.CreneauDisponible;
import monRDV.model.Lieu;
import monRDV.model.Modalite;
import monRDV.model.Motif;
import monRDV.model.Patient;
import monRDV.model.Praticien;
import monRDV.model.Profil;
import monRDV.model.RendezVous;
import monRDV.model.Specialite;
import monRDV.model.Utilisateur;

public class TestregroupeArthur {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		// debut specialite

		IDaoSpecialite daoSpecialite = new DaoSpecialiteJpa();
		List<Specialite> specialites1 = daoSpecialite.findAll();
		System.out.println("Nombre au début=" + specialites1.size());

		Specialite specialite1 = new Specialite("proctologie");
		specialite1.setId(1234L);
		specialite1.setVersion(1);

		Specialite specialite2 = new Specialite("gynecologie");
		specialite2.setId(1256L);
		specialite2.setVersion(1);

		Specialite specialite3 = new Specialite("urologie");
		specialite3.setId(1269L);
		specialite3.setVersion(1);
		
		Specialite specialite4 = new Specialite();
		specialite4.setLibelle("cardiologie");
		Specialite specialite5 = new Specialite("orthopédie");
		specialite5.setLibelle("orthopédie");
		

//		specialite1 = daoSpecialite.save(spe1);
//		specialite2 = daoSpecialite.save(spe2);
//		specialite3 = daoSpecialite.save(spe3);

//		Specialite specialite1Find = daoSpecialite.find(specialite1.getId());
//		System.out.println(specialite1.getId() + "=" + specialite1Find.getId());

//		specialites1 = daoSpecialite.findAll();

		System.out.println("Nombre avant la suppression=" + specialites1.size());

//		daoSpecialite.delete(spe2);

		// fin specialite
		
		IDaoMotif daoMotif=new DaoMotifJpa();
		List<Motif> motifs1=new ArrayList<>();
		
		Motif motif1=new Motif();
		motif1.setLibelle("contrôle des 50 ans");
		motif1.setSpecialite(specialite1);
		
		motifs1.add(motif1);

		IDaoUtilisateur daoUtilisateur = new DaoUtilisateurJpa();

		List<Utilisateur> utilisateurs = daoUtilisateur.findAll();

		System.out.println("Nombre au début=" + utilisateurs.size());

		Utilisateur utilisateur1 = new Utilisateur(); // new

		utilisateur1.setEmail("utilisateur1@gmail.com");
		utilisateur1.setTelephone("0669696969");
		utilisateur1.setDateCreation(sdf.parse("25/12/2000"));
		utilisateur1.setMotDePasse("liugfhlkjs<fhKsuil<");
		utilisateur1.setProfil(Profil.Patient);

//		utilisateur1 = daoUtilisateur.save(utilisateur1); // managed

		Utilisateur utilisateur1Find = daoUtilisateur.find(utilisateur1.getId());

		System.out.println(utilisateur1.getId() + "=" + utilisateur1Find.getId());
		System.out.println(utilisateur1.getEmail() + "=" + utilisateur1Find.getEmail());
		System.out.println(utilisateur1.getTelephone() + "=" + utilisateur1Find.getTelephone());
		System.out.println(utilisateur1.getDateCreation() + "=" + utilisateur1Find.getDateCreation());
		System.out.println(utilisateur1.getMotDePasse() + "=" + utilisateur1Find.getMotDePasse());
		System.out.println(utilisateur1.getProfil() + "=" + utilisateur1Find.getProfil());

//		utilisateur1 = daoUtilisateur.save(utilisateur1); // managed

//		utilisateur1Find = daoUtilisateur.find(utilisateur1.getId());

		System.out.println(utilisateur1.getId() + "=" + utilisateur1Find.getId());
		System.out.println(utilisateur1.getEmail() + "=" + utilisateur1Find.getEmail());
		System.out.println(utilisateur1.getTelephone() + "=" + utilisateur1Find.getTelephone());
		System.out.println(utilisateur1.getDateCreation() + "=" + utilisateur1Find.getDateCreation());
		System.out.println(utilisateur1.getMotDePasse() + "=" + utilisateur1Find.getMotDePasse());
		System.out.println(utilisateur1.getProfil() + "=" + utilisateur1Find.getProfil());

//		utilisateurs = daoUtilisateur.findAll();

		IDaoPatient daoPatient = new DaoPatientJpa();
		List<Patient> patients = daoPatient.findAll();

		Patient patient1 = new Patient();
		patient1.setDefaut(true);
		patient1.setNom("Mouden");
		patient1.setPrenom("Charlotte");
		patient1.setDateNaissance(sdf.parse("05/10/1990"));
		patient1.setDateCreation(new Date());
//		patient1.setUtilisateur(utilisateur);
//		patient1.setListRendezVous(rendezVous);
		
		Patient patient2 = new Patient();
		patient2.setDefaut(true);
		patient2.setNom("Gonzales");
		patient2.setPrenom("Arthur");
		patient2.setDateNaissance(sdf.parse("30/12/1993"));
		patient2.setDateCreation(new Date());
//		patient2.setUtilisateur(utilisateur);
//		patient2.setListRendezVous(rendezVous);
		
		Patient patient3 = new Patient();
		patient3.setDefaut(true);
		patient3.setNom("Labat");
		patient3.setPrenom("Jory");
		patient3.setDateNaissance(sdf.parse("21/10/1992"));
		patient3.setDateCreation(new Date());
//		patient3.setUtilisateur(utilisateur);
//		patient3.setListRendezVous(rendezVous);
		
		patients.add(patient3);
		patients.add(patient2);
		patients.add(patient1);

		IDaoModalite daoModalite = new DaoModaliteJpa();
		List<Modalite> modalites1 = new ArrayList<Modalite>();

		Modalite modalite1 = new Modalite();
		modalite1.setPrix(1.25f);
		modalite1.setDuree(15L);
		modalite1.setDelaiAnnulation(2L);
		modalite1.setDepassementHonoraires(false);
		modalite1.setMotif(motif1);
//		modalite1.setPraticien(praticien1);
		
		modalites1.add(modalite1);

		IDaoRendezVous daoRendezVous = new DaoRendezVousJpa();
		List<RendezVous> rendezvouss1 = new ArrayList<RendezVous>();
		

		RendezVous rendezvous1 = new RendezVous();
		rendezvous1.setUtilisateur(utilisateur1);
		rendezvous1.setPatient(patient1);
		rendezvous1.setModalite(modalite1);
		rendezvous1.setRendezVous(null);
		RendezVous rendezvous2 = new RendezVous();
		rendezvous2.setUtilisateur(utilisateur1);
		rendezvous2.setPatient(patient2);
		rendezvous2.setModalite(modalite1);
		rendezvous2.setRendezVous(null);
		RendezVous rendezvous3 = new RendezVous();
		rendezvous3.setUtilisateur(utilisateur1);
		rendezvous3.setPatient(patient3);
		rendezvous3.setModalite(modalite1);
		rendezvous3.setRendezVous(null);

		modalite1.setRendezVous(rendezvouss1);

		// Creation objets adresse

		Adresse adresse1 = new Adresse();
		Adresse adresse2 = new Adresse();
		Adresse adresse3 = new Adresse();

		adresse1.setRue("10 rue Marechal Foch");
		adresse1.setCodePostal("65000");
		adresse1.setVille("Tarbes");
		adresse1.setInformations("4eme porte à gauche en partant de la 3 porte à droite derrière la plante verte");

		adresse2.setRue("19 avenue du bobo");
		adresse2.setCodePostal("33000");
		adresse2.setVille("Bordeaux");
		adresse2.setInformations("L'entrée de la villa se trouve à côté de la 4e Ferrari");

		adresse3.setRue("144 rue de l'huitre");
		adresse3.setCodePostal("33120");
		adresse3.setVille("Arcachon");
		adresse3.setInformations("Ne cherchez pas une maison, c'est une cabane de pêcheur");
		
		
		List<Specialite> specialites2 = new ArrayList();
		List<Specialite> specialites3 = new ArrayList();
		
		List<Praticien> praticiens1 = new ArrayList();
		List<Praticien> praticiens2 = new ArrayList();
		List<Praticien> praticiens3 = new ArrayList();
		
		List<Lieu> lieux1 = new ArrayList();
		List<Lieu> lieux2 = new ArrayList();
		List<Lieu> lieux3 = new ArrayList();
		
		Lieu lieu1 = new Lieu();
		lieu1.setNom("Cabinet Caramel");
		Lieu lieu2 = new Lieu();
		lieu2.setNom("Hopital Nougat");
		Lieu lieu3 = new Lieu();
		lieu3.setNom("Cabinet Cacao");
		
		
		
		
		CreneauDisponible creneaudisponible1=new CreneauDisponible();
		creneaudisponible1.setDebut(sdf2.parse("01/12/2018 8:00"));
		creneaudisponible1.setFin(sdf2.parse("01/12/2018 8:15"));
		creneaudisponible1.setLieu(lieu1);
//		creneaudisponible1.setPraticien(praticien1); Fait plus loin
		creneaudisponible1.setRendezVous(rendezvous1);
		
		CreneauDisponible creneaudisponible2=new CreneauDisponible();
		creneaudisponible2.setDebut(sdf2.parse("01/12/2018 8:15"));
		creneaudisponible2.setFin(sdf2.parse("01/12/2018 8:30"));
		creneaudisponible2.setLieu(lieu1);
//		creneaudisponible2.setPraticien(praticien1); Fait plus loin
		creneaudisponible2.setRendezVous(rendezvous1);
		
		CreneauDisponible creneaudisponible3=new CreneauDisponible();
		
		creneaudisponible2.setDebut(sdf2.parse("01/12/2018 9:15"));
		creneaudisponible2.setFin(sdf2.parse("01/12/2018 9:30"));
		creneaudisponible2.setLieu(lieu2);
//		creneaudisponible2.setPraticien(praticien2); Fait plus loin
		creneaudisponible2.setRendezVous(rendezvous2);
		
		IDaoCreneauDisponible daoCreneaudisponible = new DaoCreneauDisponibleJpa();
		List<CreneauDisponible> creneauxdisponibles1 = new ArrayList<>();

		Praticien praticien1 = new Praticien();
		praticien1.setNom("House");
		praticien1.setPrenom("Gregory");
		praticien1.setPrendCarteVitale(true);
		praticien1.setValidationAuto(true);
		praticien1.setSpecialites(specialites1);
		praticien1.setLieux(lieux1);
		praticien1.setModalites(modalites1);
		praticien1.setCreneauDisponibles(creneauxdisponibles1);
		
		Praticien praticien2 = new Praticien("Tapie", "Bernard", true, true, specialites2, lieux2, modalites2, creneaudisponible2);
		Praticien praticien3 = new Praticien("Masse", "Gregoire", true, true, specialites3, lieux3, modalites3, null);
		creneaudisponible1.setPraticien(praticien1);
		creneaudisponible2.setPraticien(praticien1);
		creneaudisponible2.setPraticien(praticien2);
		modalite1.setPraticien(praticien1);
		
		
	}

}
