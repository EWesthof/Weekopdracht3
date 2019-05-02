package kermisApplicatie;

class LadderKlimmen extends Attractie implements GokAttractie {
	LadderKlimmen() {
		naam = "Ladderklimmen";
		prijs = 5.00;
		oppervlakte = 5;
		omzetAttractie = 0;
	}

	double omzetTotInspectie = 0;

	public double kansSpelBelastingBetalen() {

		double belasting = this.omzetAttractie * 0.3;
		this.omzetAttractie = this.omzetAttractie - belasting;
		omzetTotInspectie = 0;
		return belasting;
	}
}
