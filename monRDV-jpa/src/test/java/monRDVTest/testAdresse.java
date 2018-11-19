package monRDVTest;

import monRDV.model.Adresse;

public class testAdresse {

	public static void main(String[] args) {
		
		//Creation objets adresse
		
		Adresse adresse1 = new Adresse();
		Adresse adresse2 = new Adresse();
		Adresse adresse3 = new Adresse();
		
		adresse1.setRue("10 rue Marechal Foch");
		adresse1.setCodePostal("65000");
		adresse1.setVille("Tarbes");
		adresse1.setInformations("4eme porte à gauche en partant de la 3 porte à droite derrière la plante verte");
		
		adresse2.setRue("19 avenue du bobo");
		adresse2.setCodePostal("33000");
		adresse2.setVille("Bordeaux");
		adresse2.setInformations("L'entrée de la villa se trouve à côté de la 4e Ferrari");
		
		adresse3.setRue("144 rue de l'huitre");
		adresse3.setCodePostal("33120");
		adresse3.setVille("Arcachon");
		adresse3.setInformations("Ne cherchez pas une maison, c'est une cabane de pêcheur");
		
	}

}
