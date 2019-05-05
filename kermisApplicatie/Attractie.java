package kermisApplicatie;
import java.text.DecimalFormat;
class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzetAttractie;
	int kaartjes;
	DecimalFormat decimaleOmzet = new DecimalFormat("#.##");
	
	void draaien() throws Exception{
		System.out.println("Je zit nu in: " + this.naam);
	}
	
	void omzetUpdaten () {
		this.omzetAttractie += this.prijs;
	}
	
	void getOmzetAttractie(Attractie attractie) {
		System.out.println("De omzet van de attractie " + attractie.naam + " is €" + decimaleOmzet.format(omzetAttractie));
	}
	
	
}
