package monRDVTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import monRDV.model.Patient;
import monRDV.model.RendezVous;

public class TestArthur {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		Patient patient1=new Patient(true, "Mouden", "Charlotte", sdf.parse("05/10/1990"), new Date(), utilisateurs1, rendezVouss1);
		Patient patient2=new Patient(true, "Gonzales", "Arthur", sdf.parse("30/12/1993"), new Date(), utilisateurs1, rendezVouss1);
		Patient patient3=new Patient(true, "Labat", "Jory", sdf.parse("21/10/1992"), new Date(), utilisateurs1, rendezVouss1);
		
		RendezVous rendezvous1=new RendezVous(utilisateur1, patient1, modalite1, creneaux1);
		RendezVous rendezvous2=new RendezVous(utilisateur1, patient2, modalite1, creneaux1);
		RendezVous rendezvous3=new RendezVous(utilisateur1, patient3, modalite1, creneaux1);
		
	}

}
