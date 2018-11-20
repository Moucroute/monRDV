package monRDVTest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import formation.model.Entreprise;
import monRDV.dao.IDaoModalite;
import monRDV.dao.IDaoMotif;
import monRDV.dao.IDaoPraticien;
import monRDV.dao.IDaoRendezVous;
import monRDV.dao.IDaoSpecialite;
import monRDV.dao.jpa.DaoModaliteJpa;
import monRDV.dao.jpa.DaoMotifJpa;
import monRDV.dao.jpa.DaoPraticienJpa;
import monRDV.dao.jpa.DaoRendezVousJpa;
import monRDV.dao.jpa.DaoSpecialiteJpa;
import monRDV.model.Modalite;
import monRDV.model.Motif;
import monRDV.model.Praticien;
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
		spe1.setLibelle("gyneco");
		Specialite spe3 = new Specialite();
		spe1.setLibelle("urologie");

		spe1 = daoSpecialite.save(spe1);
		spe2 = daoSpecialite.save(spe2);
		spe3 = daoSpecialite.save(spe3);

		Specialite spe1Find = daoSpecialite.find(spe1.getId());
		System.out.println(spe1.getId() + "=" + spe1Find.getId());

		specialites1 = daoSpecialite.findAll();
		
		IDaoPraticien daoPraticien= new DaoPraticienJpa();
		List<Praticien> praticiens1 = daoPraticien.findAll();
		
		Praticien praticien1 = new Praticien();
		praticien1.getSpecialites().add(spe1);

		Praticien praticien2 = new Praticien();
		praticien2.getSpecialites().add(spe1);
		praticien2.getSpecialites().add(spe2);
		
		Praticien praticien3 = new Praticien();
		praticien3.getSpecialites().add(spe3);
		
		
		praticien1 = daoPraticien.save(praticien1);
		praticien2 = daoPraticien.save(praticien2);
		praticien3 = daoPraticien.save(praticien3);
		
		System.out.println("Nombre avant la suppression=" + specialites1.size());
		//	daoSpecialite.delete(spe2);
		
		daoPraticien.delete(praticien3);
		System.out.println("Nombre après la suppression=" + praticiens1.size());
		
		// fin specialite
		
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

				Motif motif1Find = daoMotif.find(motif1.getId());
				System.out.println(motif1.getId() + "=" + motif1Find.getId());

				motifs1.add(motif1);
				motifs1.add(motif2);
				motifs1.add(motif3);

				motifs1 = daoMotif.findAll();

				Modalite modalites1 = new Modalite();
				
				motif1.getModalites().add(modalites1);
				motif2.getModalites().add(modalites1);
				motif3.getModalites().add(modalites1);
				
				motif1.setSpecialite(spe1);
				motif2.setSpecialite(spe3);
				motif3.setSpecialite(spe2);
				
				motif1 = daoMotif.save(motif1);
				motif2 = daoMotif.save(motif2);
				motif3 = daoMotif.save(motif3);
											
				System.out.println("Nombre avant la suppression=" + motifs1.size());

//				daoMotif.delete(motif2);

		// fin motif

		// debut modalites

		IDaoModalite daoModalite = new DaoModaliteJpa();
		List<Modalite> modaliteslist = daoModalite.findAll();
		
		Modalite modalite1 = new Modalite();
		modalite1.setPrix(1.25f);
		modalite1.setDuree(15L);
		modalite1.setDelaiAnnulation(2L);
		modalite1.setDepassementHonoraires(false);
		modalite1.setMotif(motif1);
		modalite1.setPraticien(praticien1);
		
		Modalite modalite2 = new Modalite();
		modalite2.setPrix(2f);
		modalite2.setDuree(30L);
		modalite2.setDelaiAnnulation(2L);
		modalite2.setDepassementHonoraires(false);
		modalite2.setMotif(motif1);
		modalite2.setPraticien(praticien2);
		
		Modalite modalite3 = new Modalite();
		modalite3.setPrix(2f);
		modalite3.setDelaiAnnulation(2L);
		modalite3.setDepassementHonoraires(false);
		modalite3.setMotif(motif2);
		modalite3.setPraticien(praticien2);
		
		modalite1 = daoModalite.save(modalite1);
		modalite2 = daoModalite.save(modalite2);
		modalite3 = daoModalite.save(modalite3);
		
		modaliteslist.add(modalite1);
		modaliteslist.add(modalite2);
		modaliteslist.add(modalite2);
									
		IDaoRendezVous daoRendezVous = new DaoRendezVousJpa();
		List<RendezVous> rendezvouss1 = new ArrayList<RendezVous>();
		
		RendezVous rendezvous1 = new RendezVous();
//		rendezvous1.setUtilisateur(utilisateur1);
//		rendezvous1.setPatient(patient1);
		rendezvous1.setModalite(modalite1);
		rendezvous1.setRendezVous(null);
		RendezVous rendezvous2 = new RendezVous();
//		rendezvous2.setUtilisateur(utilisateur1);
//		rendezvous2.setPatient(patient2);
		rendezvous2.setModalite(modalite2);
		rendezvous2.setRendezVous(null);
		RendezVous rendezvous3 = new RendezVous();
//		rendezvous3.setUtilisateur(utilisateur1);
//		rendezvous3.setPatient(patient3);
		rendezvous3.setModalite(modalite3);
		rendezvous3.setRendezVous(null);
		
		rendezvous1 = daoRendezVous.save(rendezvous1);
		rendezvous2 = daoRendezVous.save(rendezvous2);
		rendezvous3 = daoRendezVous.save(rendezvous3);
		
		modalite1.getRendezVous().add(rendezvous1);
		modalite2.getRendezVous().add(rendezvous2);
		modalite3.getRendezVous().add(rendezvous3);
//
//		daoModalite.delete(modalite2);
				
		// fin modalites
		

	}

}
