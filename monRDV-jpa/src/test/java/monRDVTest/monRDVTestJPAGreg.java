package monRDVTest;

import java.util.ArrayList;
import java.util.List;

import monRDV.model.Lieu;
import monRDV.model.Praticien;
import monRDV.model.Specialite;

public class monRDVTestJPAGreg {

	public static void main(String[] args) {
		
		List<Specialite> specialites1 = new ArrayList();
		List<Specialite> specialites2 = new ArrayList();
		List<Specialite> specialites3 = new ArrayList();
		
		List<Praticien> praticiens1 = new ArrayList();
		List<Praticien> praticiens2 = new ArrayList();
		List<Praticien> praticiens3 = new ArrayList();
		
		List<Lieu> Lieux1 = new ArrayList();
		List<Lieu> Lieux2 = new ArrayList();
		List<Lieu> Lieux3 = new ArrayList();
		
		Lieu lieu1 = new Lieu("Cabinet Caramel");
		Lieu lieu2 = new Lieu("Hopital Nougat");
		Lieu lieu3 = new Lieu("Cabinet Cacao");
		
		
		Specialite specialite1 = new Specialite("cardiologie", praticiens1, motifs1);
		Specialite specialite2 = new Specialite("orthopédie", praticiens2, motifs2);
		Specialite specialite3 = new Specialite("urologie", praticiens3, motifs3);

		Praticien praticien1 = new Praticien("House", "Gregory", true, true, specialites1, lieux1, modalites1, creneaux1);
		Praticien praticien2 = new Praticien("Tapie", "Bernard", true, true, specialites2, lieux2, modalites2, creneaux2);
		Praticien praticien3 = new Praticien("Masse", "Gregoire", true, true, specialites3, lieux3, modalites3, creneaux3);
		
		

		
		
		

	}

}
