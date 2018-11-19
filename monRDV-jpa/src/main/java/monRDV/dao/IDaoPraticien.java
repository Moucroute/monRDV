package monRDV.dao;

import java.util.List;

import monRDV.model.Praticien;

public interface IDaoPraticien extends IDao<Praticien, Long>{

	List<Praticien> findByNomLieuSpecialite(String nom, String lieu, String libelle);

	
}
