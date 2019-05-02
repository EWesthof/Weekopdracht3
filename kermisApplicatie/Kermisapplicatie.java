package kermisApplicatie;

import java.util.ArrayList;
import java.util.Random;
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
		Kermisapplicatie DeventerKermis = new Kermisapplicatie();
		
		DeventerKermis.bezoeken();
		DeventerKermis.alleOmzet();
		
		
	}
	
	void bezoeken() {
		Random belastingInner = new Random();
		int belastingGeind = belastingInner.nextInt(15);
		int attractiesgedraaid = 0;
		System.out.println("Welkom op de kermis!");
		boolean nieuweAttractie = true;
		while (nieuweAttractie) {
		if (attractiesgedraaid % 2 == 0) {
		kassa.kaartVerkocht();
		System.out.println("In welke attractie wilt u? Typ 1 voor Botsauto's, 2 voor de Spin, 3 voor SpiegelPaleis, 4 voor Spookhuis, 5 voor Hawaii en 6 voor LadderKlimmen");	
		Scanner sc = new Scanner(System.in);
		int getal = sc.nextInt();
		Attractie actief = attracties.get(getal -1);
		actief.kaartjes +=1;
		try {
		actief.draaien(actief);
		}
		catch(Exception e) {
		System.out.println("De attractie heeft een onderhoudsbeurt nodig. Druk op m om de monteur erbij te halen");
		Scanner onderhoud = new Scanner(System.in);
		String beurt = onderhoud.nextLine();
		if (beurt.equals("m")){
		((RisicoRijkeAttracties) actief).opstellingsKeuring();
		}
		}
		kassa.omzetBijwerken(actief);
		actief.omzetUpdaten(actief);

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
		else {
			System.out.println("Er moet belasting betaald worden");
			double totalebelasting = 0;
			for (Attractie attractie:attracties){
				if (attractie instanceof GokAttractie) {
					totalebelasting += ((GokAttractie) attractie).kansSpelBelastingBetalen();
		
				}
		}
			System.out.println("Er is €" + totalebelasting + " betaald.");
			Double winst = kassa.omzetTeruggeven() - totalebelasting;
			System.out.println("De winst van de kermis bedraagt nu nog " + winst);
			
		}
		
		attractiesgedraaid += 1;
		}
	}

		
	
		void alleOmzet() {
			System.out.println("Wilt u de omzet of het aantal kaartjes? Voer o in voor omzet, k voor kaartjes");
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
				}
				
	
		
}
