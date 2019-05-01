package kermisApplicatie;

class Attractie {
	String naam;
	static double prijs;
	int oppervlakte;
	int omzetAttractie;
	int kaartjes;
	
	void draaien(Attractie attractie){
		System.out.println("Je zit nu in de " + attractie.naam);
	}
	
	void omzetUpdaten(Attractie attractie) {
		attractie.omzetAttractie += Attractie.prijs;
	}
	
	void getOmzetAttractie(Attractie attractie) {
		System.out.println("De omzet van de attractie " + attractie.naam + " is €" + omzetAttractie);
	}
	
	
}
