package monRDV.dao;

import java.util.List;

import monRDV.model.Utilisateur;

public interface IDaoUtilisateur extends IDao<Utilisateur, Long>{
	
	List<Utilisateur> findByEmail(String email);

}
