package kermisApplicatie;

class LadderKlimmen extends Attractie implements GokAttractie {
	LadderKlimmen() {
		naam = "Laddertje";
		prijs = 5.00;
		oppervlakte = 5;
		omzetAttractie = 0;
	}
	
	double omzetTotInspectie = 0;
 @Override
 void omzetUpdaten() {
		this.omzetAttractie += this.prijs;
		this.omzetTotInspectie += this.prijs;
	}
	

	public double kansSpelBelastingBetalen() {
		double belasting = this.omzetTotInspectie * 0.3;
		this.omzetAttractie -= belasting;
		omzetTotInspectie = 0;
		return belasting;
	}
}
