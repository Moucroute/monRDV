package monRDV.dao;

import java.util.List;

import monRDV.model.Lieu;

public interface IDaoLieu extends IDao<Lieu,Long> {
	
	List<Lieu> findByNom(String nom);

}
