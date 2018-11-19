package monRDVTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import monRDV.dao.IDaoUtilisateur;
import monRDV.dao.jpa.DaoUtilisateurJpa;
import monRDV.model.Profil;
import monRDV.model.Utilisateur;



public abstract class TestJean {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		IDaoUtilisateur daoUtilisateur = new DaoUtilisateurJpa();

		List<Utilisateur> utilisateurs = daoUtilisateur.findAll();

		System.out.println("Nombre au début=" + utilisateurs.size());

		Utilisateur utilisateur1 = new Utilisateur(); // new

		utilisateur1.setEmail("utilisateur1@gmail.com");
		utilisateur1.setTelephone("0669696969");
		utilisateur1.setDateCreation(sdf.parse("25/12/2000"));
		utilisateur1.setMotDePasse("liugfhlkjs<fhKsuil<");
		utilisateur1.setProfil(Profil.Patient);
		
		
		utilisateur1 = daoUtilisateur.save(utilisateur1); // managed

		Utilisateur utilisateur1Find = daoUtilisateur.find(utilisateur1.getId());

		System.out.println(utilisateur1.getId() + "=" + utilisateur1Find.getId());
		System.out.println(utilisateur1.getEmail() + "=" + utilisateur1Find.getEmail());
		System.out.println(utilisateur1.getTelephone() + "=" + utilisateur1Find.getTelephone());
		System.out.println(utilisateur1.getDateCreation() + "=" + utilisateur1Find.getDateCreation());
		System.out.println(utilisateur1.getMotDePasse() + "=" + utilisateur1Find.getMotDePasse());
		System.out.println(utilisateur1.getProfil() + "=" + utilisateur1Find.getProfil());
		
		utilisateur1 = daoUtilisateur.save(utilisateur1); // managed

		utilisateur1Find = daoUtilisateur.find(utilisateur1.getId());

		System.out.println(utilisateur1.getId() + "=" + utilisateur1Find.getId());
		System.out.println(utilisateur1.getEmail() + "=" + utilisateur1Find.getEmail());
		System.out.println(utilisateur1.getTelephone() + "=" + utilisateur1Find.getTelephone());
		System.out.println(utilisateur1.getDateCreation() + "=" + utilisateur1Find.getDateCreation());
		System.out.println(utilisateur1.getMotDePasse() + "=" + utilisateur1Find.getMotDePasse());
		System.out.println(utilisateur1.getProfil() + "=" + utilisateur1Find.getProfil());
		
		utilisateurs = daoUtilisateur.findAll();

		System.out.println("Nombre avant la suppression="+utilisateurs.size());
		
//		daoUtilisateur.delete(utilisateur1);
//		
//		utilisateur1Find = daoUtilisateur.find(utilisateur1.getId());
//		
//		System.out.println(utilisateur1Find);
	}

}
