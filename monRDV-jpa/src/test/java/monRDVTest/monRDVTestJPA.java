package monRDVTest;

import java.text.ParseException;
import java.util.List;

import monRDV.dao.IDaoSpecialite;
import monRDV.dao.jpa.DaoSpecialiteJpa;
import monRDV.model.Specialite;

public class monRDVTestJPA {

	public static void main(String[] args) throws ParseException {

		// debut specialite

		IDaoSpecialite daoSpecialite = new DaoSpecialiteJpa();
		List<Specialite> specialites = daoSpecialite.findAll();
		System.out.println("Nombre au début=" + specialites.size());

		Specialite spe1 = new Specialite("proctologie");
		spe1.setId(1234L);
		spe1.setVersion(1);

		Specialite spe2 = new Specialite("gynecologie");
		spe1.setId(1256L);
		spe1.setVersion(1);

		Specialite spe3 = new Specialite("urologie");
		spe1.setId(1269L);
		spe1.setVersion(1);

		spe1 = daoSpecialite.save(spe1);
		spe2 = daoSpecialite.save(spe2);
		spe3 = daoSpecialite.save(spe3);

		Specialite spe1Find = daoSpecialite.find(spe1.getId());
		System.out.println(spe1.getId() + "=" + spe1Find.getId());

		specialites = daoSpecialite.findAll();

		System.out.println("Nombre avant la suppression=" + specialites.size());

//		daoSpecialite.delete(spe2);

		// fin specialite

	}

}
