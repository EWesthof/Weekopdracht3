package kermisApplicatie;

import java.util.Scanner;
import java.text.DecimalFormat;

class Kassa {
DecimalFormat decimaleOmzet = new DecimalFormat("#.##");
double omzetKermis;
private int kaartjes;


public double omzetBijwerken(Attractie attractie) {
	omzetKermis += attractie.prijs;
	return omzetKermis;
}
public double omzetTeruggeven() {
	return omzetKermis;
}
	
public void omzetTonen() {
	System.out.println("De gehele omzet van de kermis is €" + decimaleOmzet.format(omzetKermis));
}

public void kaartVerkocht() {
	kaartjes += 1;
}

public void kaartenVerkoop() {
	System.out.println("Er zijn in totaal " + kaartjes + " kaartjes verkocht");
}

void alleOmzetOfKaartjes(Kermisapplicatie kermisapplicatie) {
	System.out.println("Wilt u de omzet of het aantal kaartjes? Voer o in voor omzet, k voor kaartjes");
	Scanner aanDeKassa = new Scanner(System.in);
	String keuze = aanDeKassa.nextLine();
	if (keuze.equals("o")) {
		this.omzetTonen();
		for (Attractie attractie: kermisapplicatie.attracties) {
			attractie.getOmzetAttractie(attractie);
		}	
	}
	else if (keuze.equals("k")) {
		this.kaartenVerkoop();
		for (Attractie attractie: kermisapplicatie.attracties) {
			System.out.println("Voor " + attractie.naam + " zijn " + attractie.kaartjes + " kaartjes verkocht");
		}
	}
		}
}
