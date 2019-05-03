package kermisApplicatie;

public class BelastingInspecteur {
	double BelastingInnen(GokAttractie gokattractie) {
		String naam = ((Attractie)gokattractie).naam; 
		double belasting = gokattractie.kansSpelBelastingBetalen();
		System.out.println("Er is €" + belasting + " betaald voor het " + naam);
		return belasting;
	}
	
	double TotaleBelastingInnen(Spin spin, LadderKlimmen ladderklimmen) {
		System.out.println("Er moet belasting betaald worden");
		double totaleBelasting = this.BelastingInnen(spin) + this.BelastingInnen(ladderklimmen);
		return totaleBelasting;
		
	}
	
}
