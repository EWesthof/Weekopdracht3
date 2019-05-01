package kermisApplicatie;

class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzetAttractie;
	int kaartjes;
	
	void draaien(Attractie attractie){
		System.out.println("Je zit nu in de " + attractie.naam);
	}
	
	void omzetUpdaten(Attractie attractie) {
		attractie.omzetAttractie += attractie.prijs;
	}
	
	void getOmzetAttractie(Attractie attractie) {
		System.out.println("De omzet van de attractie " + attractie.naam + " is €" + omzetAttractie);
	}
	
	
}
