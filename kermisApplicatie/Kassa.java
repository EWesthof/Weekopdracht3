package kermisApplicatie;

class Kassa {
private double omzetKermis;
private int kaartjes;

public double omzetBijwerken(Attractie acttractie) {
	omzetKermis += Attractie.prijs;
	return omzetKermis;
}
public void omzetTonen() {
	System.out.println("De gehele omzet van de kermis is €" + omzetKermis);
}

public void kaartVerkocht() {
	kaartjes += 1;
}

public void kaartenVerkoop() {
	System.out.println("Er zijn in totaal " + kaartjes + " kaartjes verkocht");
}
}
