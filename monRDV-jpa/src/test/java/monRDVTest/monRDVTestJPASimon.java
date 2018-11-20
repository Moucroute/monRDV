package monRDVTest;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class monRDVTestJPASimon {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRDV");
		EntityManager em = null;
		EntityTransaction tx = null;

		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			
			tx.begin();
			
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
