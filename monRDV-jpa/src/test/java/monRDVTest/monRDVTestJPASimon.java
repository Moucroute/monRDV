package monRDVTest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import monRDV.dao.IDaoPraticien;
import monRDV.dao.jpa.DaoPraticienJpa;
import monRDV.model.Praticien;

public class monRDVTestJPASimon {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRDV");
		EntityManager em = null;
		EntityTransaction tx = null;
		IDaoPraticien daoPraticien = new DaoPraticienJpa();
		List<Praticien> praticiens = new ArrayList<>();

		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			
			tx.begin();
			
			praticiens = daoPraticien.findByNomLieuSpecialite("Mouden","Cabinet Caramel","proctologie");
			
			for (Praticien praticien : praticiens) {
				System.out.println(praticien.getId());
				System.out.println(praticien.getNom());
				System.out.println(praticien.getPrenom());
				System.out.println(praticien.getPrendCarteVitale());
			}
			
			
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
