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
			if (attractiesgedraaid != 2) {
				blijKind.bezoeken(DeventerKermis, kassa);
				attractiesgedraaid += 1;
			}
			else {
				BelastingInspecteur Geldwolf = new BelastingInspecteur();
				kassa.omzetKermis -= Geldwolf.TotaleBelastingInnen(spinnetje, laddertje);
				attractiesgedraaid = 0;
			}
	}
		kassa.alleOmzet(DeventerKermis);
}
}