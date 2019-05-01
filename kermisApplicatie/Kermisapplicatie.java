package kermisApplicatie;

import java.util.Scanner;

class Kermisapplicatie {
	BotsAuto botsAuto = new BotsAuto();
	Attractie spin = new Spin();
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
		System.out.println("In welke attractie wilt u? Typ 1 voor Botsauto's, 2 voor de Spin");	
		Scanner sc = new Scanner(System.in);
		int getal = sc.nextInt();
		switch (getal) {
			case 1:
			botsAuto.draaien(botsAuto);
			kassa.omzetBijwerken(botsAuto);
			botsAuto.omzetUpdaten(botsAuto);
			botsAuto.kaartjes += 1;
			break;
			case 2:
			spin.draaien(spin);
			kassa.omzetBijwerken(spin);
			spin.omzetUpdaten(spin);
			spin.kaartjes += 1;
			break;
	}
	
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
			System.out.println("Wilt u de omzet of het aantal kaartjes? Voer o in voor omzet, k voor kaartjes.");
			Scanner aanDeBalie = new Scanner(System.in);
			String keuze = aanDeBalie.nextLine();
			if (keuze.equals("o")) {
				kassa.omzetTonen();
				botsAuto.getOmzetAttractie(botsAuto);
				spin.getOmzetAttractie(spin);	
			}
			else if (keuze.contentEquals("k")) {
				kassa.kaartenVerkoop();
				System.out.println("Voor de botsauto's zijn " + botsAuto.kaartjes + " verkocht");
				System.out.println("Voor de spin zijn " + spin.kaartjes + " verkocht");
				
			}
			
		
	}	
}
