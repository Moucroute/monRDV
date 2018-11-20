package monRDV.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import monRDV.Application;
import monRDV.dao.IDaoPraticien;
import monRDV.model.Praticien;



public class DaoPraticienJpa implements IDaoPraticien {

	@Override
	public List<Praticien> findAll() {
		List<Praticien> list = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Query query = em.createQuery("select p from Praticien p");
			
			list = query.getResultList();
			
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

		return list;
	}

	@Override
	public Praticien find(Long id) {
		Praticien praticien = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			praticien = em.find(Praticien.class, id);

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

		return praticien;
	}
	
	@Override
	public Praticien save(Praticien obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			
			obj = em.merge(obj);
			
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
		
		return obj;
	}

	@Override
	public void delete(Praticien obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			
			em.remove(em.merge(obj));

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
	}


	@Override
	public List<Praticien> findByNomLieuSpecialite(String nom, String lieu, String libelle) {
		List<Praticien> list = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			

			TypedQuery<Praticien> query = em.createQuery("select p from Praticien p join fetch p.lieux l where p.nom = :param1 and where l.nom = :param2", Praticien.class);
			query.setParameter("param1", nom);
			query.setParameter("param2", lieu);
//			query.setParameter("param3", libelle);
			list = query.getResultList();
			
			if ((nom != null)&&(lieu != null)&&(libelle != null)) {
				query = em.createQuery("select p from praticien p left join fetch p.specialite left join fetch p.lieux where p.nom = :param1 and :param2 member of p.lieux.nom and :param3 member of p.specialites.libelle", Praticien.class);


			}
			
//			else if ((nom == null)&&(lieu != null)&&(libelle != null)) {
//				query = em.createQuery("select p from praticien p left join fetch p.specialite left join fetch p.lieux where :param2 member of p.lieux and :param3 member of p.specialites", Praticien.class);	
//			}
//			
//			else if ((nom == null)&&(lieu == null)&&(libelle != null)) {
//				query = em.createQuery("select p from praticien p left join fetch p.specialite where :param3 member of p.specialites", Praticien.class);
//			}
//			
//			else if ((nom != null)&&(lieu == null)&&(libelle == null)) {
//				query = em.createQuery("select p from praticien p where p.nom = :param1",  Praticien.class);
//			}
//			
//			else if ((nom == null)&&(lieu != null)&&(libelle == null)) {
//				query = em.createQuery("select p from praticien p left join fetch p.lieux where :param2 member of p.lieux",  Praticien.class);
//			}
//			
//			else if ((nom == null)&&(lieu == null)&&(libelle != null)) {
//				query = em.createQuery("select p from praticien p left join fetch p.specialites where :param3 member of p.specialites",  Praticien.class);
//			}
//			
//			else if ((nom != null)&&(lieu != null)&&(libelle == null)) {
//				query = em.createQuery("select p from praticien p left join fetch p.lieux where p.nom = :param1 and :param2 member of p.lieux",  Praticien.class);
//			}
//			
//			else if ((nom != null)&&(lieu == null)&&(libelle != null)) {
//				query = em.createQuery("select p from praticien p left join fetch p.specialites where p.nom = :param1 and :param3 member of p.specialites",  Praticien.class);
//
//			}
		
			if (query != null) {
				query.setParameter("param1", nom);
				query.setParameter(":param2", lieu);
				query.setParameter(":param3", libelle);
				
				list = query.getResultList();

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

		return list;
	}

	
}
