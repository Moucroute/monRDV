package monRDVTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import monRDV.model.Patient;
import monRDV.model.Praticien;

public class TestViviModel {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRDV");

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Praticien praticien1 = new Praticien();
			praticien1.setNom("Sultab");
			praticien1.setPrenom("Eric");

			em.persist(praticien1);
			
			Patient patient1 = new Patient();
			patient1.setNom("Virginie");
			patient1.setPrenom("Jorda");

			em.persist(patient1);

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
