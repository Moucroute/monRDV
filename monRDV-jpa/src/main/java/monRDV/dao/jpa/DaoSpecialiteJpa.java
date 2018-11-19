package monRDV.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import monRDV.Application;
import monRDV.dao.IDaoSpecialite;
import monRDV.model.Specialite;



public class DaoSpecialiteJpa implements IDaoSpecialite {

		@Override
		public  List<Specialite> findAll() {
			List<Specialite> list = null;
			EntityManager em = null;
			EntityTransaction tx = null;

			try {
				em = Application.getInstance().getEmf().createEntityManager();
				tx = em.getTransaction();
				tx.begin();

				Query query = em.createQuery("select s from Specilaite s");
				
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
		public Specialite find(Long id) {
			Specialite specialite = null;
			EntityManager em = null;
			EntityTransaction tx = null;

			try {
				em = Application.getInstance().getEmf().createEntityManager();
				tx = em.getTransaction();
				tx.begin();

				specialite = em.find(Specialite.class, id);

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

			return specialite;
		}

		@Override
		public Specialite save(Specialite obj) {
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
		public void delete(Specialite obj) {
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
	}






