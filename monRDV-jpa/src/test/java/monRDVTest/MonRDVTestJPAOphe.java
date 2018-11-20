package monRDVTest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import formation.model.Entreprise;
import monRDV.dao.IDaoMotif;
import monRDV.dao.IDaoRendezVous;
import monRDV.dao.IDaoSpecialite;
import monRDV.dao.jpa.DaoMotifJpa;
import monRDV.dao.jpa.DaoRendezVousJpa;
import monRDV.dao.jpa.DaoSpecialiteJpa;
import monRDV.model.Modalite;
import monRDV.model.Motif;
import monRDV.model.RendezVous;
import monRDV.model.Specialite;

public class MonRDVTestJPAOphe {

	public static void main(String[] args) throws ParseException {

		// debut specialite

		IDaoSpecialite daoSpecialite = new DaoSpecialiteJpa();
		List<Specialite> specialites1 = daoSpecialite.findAll();
		System.out.println("Nombre au début=" + specialites1.size());

		Specialite spe1 = new Specialite();
		spe1.setLibelle("proctologie");
		Specialite spe2 = new Specialite();
		spe1.setLibelle("proctologie");
		Specialite spe3 = new Specialite();
		spe1.setLibelle("proctologie");

		spe1 = daoSpecialite.save(spe1);
		spe2 = daoSpecialite.save(spe2);
		spe3 = daoSpecialite.save(spe3);

		Specialite spe1Find = daoSpecialite.find(spe1.getId());
		System.out.println(spe1.getId() + "=" + spe1Find.getId());

		specialites1 = daoSpecialite.findAll();

		System.out.println("Nombre avant la suppression=" + specialites1.size());

//		daoSpecialite.delete(spe2);

		// fin specialite

		// debut modalites

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
		// fin modalites
		
		// motif
		IDaoMotif daoMotif = new DaoMotifJpa();
		List<Motif> motifs1 = daoMotif.findAll();
		System.out.println("Nombre au début=" + motifs1.size());

		Motif motif1 = new Motif();
		motif1.setLibelle("consultation de suivi");

		Motif motif2 = new Motif();
		motif2.setLibelle("consultation de gynecologie");
		
		Motif motif3 = new Motif();
		motif3.setLibelle("consultation de proctologie");

		motif1 = daoMotif.save(motif1);
		motif2 = daoMotif.save(motif2);
		motif3 = daoMotif.save(motif3);

		Specialite motif1Find = daoMotif.find(motif1.getId());
		System.out.println(motif1.getId() + "=" + motif1Find.getId());

		motifs1.add(motif1);
		motifs1.add(motif2);
		motifs1.add(motif3);

		motifs1 = daoMotif.findAll();

		motif1.getModalites(modalites1);
		motif2.getModalites(modalites1);
		motif3.getModalites(modalites1);

		System.out.println("Nombre avant la suppression=" + motifs1.size());

//		daoMotif.delete(motif2);

// fin motif
	}

}
