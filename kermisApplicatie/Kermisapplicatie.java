package kermisApplicatie;

import java.util.ArrayList;
import java.util.Scanner;

class Kermisapplicatie {
	
	ArrayList<Attractie> attracties = new ArrayList<>();
	Kermisapplicatie(){
		attracties.add(new BotsAuto());
		attracties.add(new Spin());
		attracties.add(new SpiegelPaleis());
		attracties.add(new Spookhuis());
		attracties.add(new Hawaii());
		attracties.add(new LadderKlimmen());
	}
	
	Kassa kassa = new Kassa();

	public static void main(String[] args) {
		System.out.println("Welkom op de kermis!");
		Kermisapplicatie DeventerKermis = new Kermisapplicatie();
		DeventerKermis.bezoeken();
		DeventerKermis.alleOmzet();
		
	}
	
	void bezoeken() {
		boolean nieuweAttractie = true;
		while (nieuweAttractie) {
		kassa.kaartVerkocht();
		System.out.println("In welke attractie wilt u? Typ 1 voor Botsauto's, 2 voor de Spin, 3 voor SpiegelPaleis, 4 voor Spookhuis, 5 voor Hawaii en 6 voor LadderKlimmen");	
		Scanner sc = new Scanner(System.in);
		int getal = sc.nextInt();
		Attractie actief = attracties.get(getal -1);
		actief.draaien(actief);
		kassa.omzetBijwerken(actief);
		actief.omzetUpdaten(actief);
		actief.kaartjes +=1;
		
	
		System.out.println("Wilt u in nog een attractie? Typ ja voor doorgaan, typ nee voor stoppen");
		Scanner doorgaan = new Scanner(System.in);
		String ingevoerd = doorgaan.nextLine();
		ingevoerd.toLowerCase();
		switch (ingevoerd) {
		case "ja":
			System.out.println("U gaat in nog een attractie");
			break;
		case "nee":
			System.out.println("Bedankt voor uw bezoek! We hopen u nog eens te zien");
			nieuweAttractie = false;
		}
		}
}
		void alleOmzet() {
			System.out.println("Wilt u de omzet of het aantal kaartjes? Voer o in voor omzet, k voor kaartjes. Als u belasting wilt laten betalen, toets b");
			Scanner aanDeBalie = new Scanner(System.in);
			String keuze = aanDeBalie.nextLine();
			if (keuze.equals("o")) {
				kassa.omzetTonen();
				for (Attractie attractie: attracties) {
					attractie.getOmzetAttractie(attractie);
				}	
			}
			else if (keuze.equals("k")) {
				kassa.kaartenVerkoop();
				for (Attractie attractie: attracties) {
					System.out.println("Voor de " + attractie.naam + " zijn " + attractie.kaartjes + " kaartjes verkocht");
				}
			}
			else if (keuze.equals("b")) {
				BelastingInspecteur belastingInspecteur = new BelastingInspecteur();
				BelastingBetalen(belastingInspecteur);
				
					}
				}
				
	
		void BelastingBetalen(BelastingInspecteur belastingInspecteur) {
			double totalebelasting = 0;
			for (Attractie attractie:attracties){
				if (attractie instanceof GokAttractie) {
					totalebelasting += ((GokAttractie) attractie).kansSpelBelastingBetalen();
					
				}
		}
			System.out.println("Er is €" + totalebelasting + " betaald.");
			Double omzetMinBelasting = kassa.omzetTeruggeven() - totalebelasting;
			System.out.println("De omzet van de kermis bedraagt nu nog " + omzetMinBelasting);
			
}
}
