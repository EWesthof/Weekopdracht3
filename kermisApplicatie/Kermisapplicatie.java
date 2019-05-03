package kermisApplicatie;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Kermisapplicatie {
	ArrayList<Attractie> attracties = new ArrayList<>();
	static Spin spinnetje = new Spin();
	static LadderKlimmen laddertje = new LadderKlimmen();

	Kermisapplicatie() {
		attracties.add(new BotsAuto());
		attracties.add(spinnetje);
		attracties.add(new SpiegelPaleis());
		attracties.add(new Spookhuis());
		attracties.add(new Hawaii());
		attracties.add(laddertje);
	}
	static boolean nieuweAttractie = true;
	public static void main(String[] args) {
		Kermisapplicatie DeventerKermis = new Kermisapplicatie();
		Kassa kassa = new Kassa();
		Bezoeker blijKind = new Bezoeker();
		Random belastingInner = new Random();
		int belastingGeind = belastingInner.nextInt(15);
		System.out.println("Welkom op de kermis!");
		int attractiesgedraaid = 0;
		while (nieuweAttractie) {
			if (attractiesgedraaid != belastingGeind) {
				kassa.kaartVerkocht();
				Attractie actief = DeventerKermis.attracties.get(blijKind.AttractieKiezen() -1);
				actief.kaartjes +=1;
				try {
				actief.draaien();
				}
				catch(Exception e) {
				OnderhoudsMonteur HandigeHarry = new OnderhoudsMonteur();
				HandigeHarry.onderhouden((RisicoRijkeAttracties)actief);
				}
				kassa.omzetBijwerken(actief);
				actief.omzetUpdaten();
				attractiesgedraaid += 1;
				blijKind.NogEenAttractie(DeventerKermis);
			}
			else {
				BelastingInspecteur Geldwolf = new BelastingInspecteur();
				kassa.omzetKermis -= Geldwolf.TotaleBelastingInnen(spinnetje, laddertje);
				attractiesgedraaid = 0;
				belastingGeind = belastingInner.nextInt(15);
			}
	}
		kassa.alleOmzetOfKaartjes(DeventerKermis);
}
}