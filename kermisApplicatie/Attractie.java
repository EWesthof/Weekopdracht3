package kermisApplicatie;

class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzetAttractie;
	int kaartjes;
	
	void draaien() throws Exception{
		System.out.println("Je zit nu in: " + this.naam);
	}
	
	void omzetUpdaten () {
		this.omzetAttractie += this.prijs;
	}
	
	void getOmzetAttractie(Attractie attractie) {
		System.out.println("De omzet van de attractie " + attractie.naam + " is €" + omzetAttractie);
	}
	
	
}
