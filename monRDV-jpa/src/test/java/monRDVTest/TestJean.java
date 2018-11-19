package monRDVTest;

import java.text.SimpleDateFormat;
import java.util.List;

import monRDV.dao.IDaoUtilisateur;
import monRDV.dao.jpa.DaoUtilisateurJpa;
import monRDV.model.Utilisateur;



public abstract class TestJean {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		IDaoUtilisateur daoUtilisateur = new DaoUtilisateurJpa();

		List<Utilisateur> utilisateurs = daoUtilisateur.findAll();

		System.out.println("Nombre au début=" + utilisateurs.size());

		Utilisateur utilisateur1 = new Utilisateur(); // new

		utilisateur1.setEmail("utilisateur1@gmail.com");
		utilisateur1.setTelephone("0669696969");
		utilisateur1.setDateCreation(sdf.parse("25/12/2000"));
		utilisateur1.setMotDePasse("liugfhlkjs<fhKsuil<");
		utilisateur1.setProfil(profil);
		
		
		utilisateur1 = daoUtilisateur.save(utilisateur1); // managed

		Utilisateur utilisateur1Find = daoUtilisateur.find(utilisateur1.getNom());

		System.out.println(utilisateur1.getNom() + "=" + matiere1Find.getNom());
		System.out.println(utilisateur1.getDuree() + "=" + matiere1Find.getDuree());
		System.out.println(utilisateur1.getNiveau() + "=" + matiere1Find.getNiveau());

		utilisateur1 = daoUtilisateur.save(utilisateur1); // managed

		matiere1Find = daoUtilisateur.find(utilisateur1.getNom());

		System.out.println(utilisateur1.getNom() + "=" + matiere1Find.getNom());
		System.out.println(utilisateur1.getDuree() + "=" + matiere1Find.getDuree());
		System.out.println(utilisateur1.getNiveau() + "=" + matiere1Find.getNiveau());
		
		utilisateurs = daoUtilisateur.findAll();

		System.out.println("Nombre avant la suppression="+utilisateurs.size());
		
//		daoMatiere.delete(matiere1);
//		
//		matiere1Find = daoMatiere.find(matiere1.getNom());
//		
//		System.out.println(matiere1Find);
	}

}
