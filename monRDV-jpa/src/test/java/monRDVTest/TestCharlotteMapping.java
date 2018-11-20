package monRDVTest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import monRDV.model.Patient;
import monRDV.model.Praticien;
import monRDV.model.Profil;
import monRDV.model.Utilisateur;

public class TestCharlotteMapping {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRDV");

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Utilisateur util1 = new Utilisateur();
			util1.setProfil(Profil.Patient);
			
			Patient pat1 = new Patient();
			pat1.setNom("Baratin");
			Patient pat2 = new Patient();
			pat2.setNom("Sultan");
			List<Patient> listPatient = new ArrayList<Patient>();
			listPatient.add(pat1);
			listPatient.add(pat2);
			
			
			util1.setListPatient(listPatient);

			em.persist(util1);
		

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

		emf.close();

	}

}
