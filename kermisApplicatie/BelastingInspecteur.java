package kermisApplicatie;
import java.text.DecimalFormat;
public class BelastingInspecteur {
	double BelastingInnen(GokAttractie gokattractie) {
		String naam = ((Attractie)gokattractie).naam; 
		double belasting = gokattractie.kansSpelBelastingBetalen();
		DecimalFormat dOS = new DecimalFormat("#.##");
		System.out.println("Er is €" + dOS.format(belasting) + " betaald voor het " + naam);
		return belasting;
	}
	
	
	double AlleBelasting(Kermisapplicatie kermis) {
		System.out.println("De Geldwolf is gearriveerd, er moet belasting betaald worden");
		double totaleBelasting = 0.0;
		for (Attractie attractie : kermis.attracties) {
			if (attractie instanceof GokAttractie) {
				totaleBelasting += this.BelastingInnen((GokAttractie)attractie);
			}
		}
		return totaleBelasting;
	}
	
}
