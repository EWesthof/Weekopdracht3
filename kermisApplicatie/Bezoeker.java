package kermisApplicatie;

import java.util.Random;
import java.util.Scanner;

public class Bezoeker {

	int AttractieKiezen() {
		System.out.println("In welke attractie wilt u? Typ 1 voor Botsauto's, 2 voor de Spin, 3 voor SpiegelPaleis, 4 voor Spookhuis, 5 voor Hawaii en 6 voor LadderKlimmen");	
		Scanner sc = new Scanner(System.in);
		int getal = sc.nextInt();
		return getal;
	}
	
	void NogEenAttractie (Kermisapplicatie kermisapplicatie) {
			System.out.println("Wilt u in nog een attractie? Typ ja voor doorgaan, typ nee voor stoppen");
			Scanner doorgaan = new Scanner(System.in);
			switch (doorgaan.nextLine().toLowerCase()) {
			case "ja":
				System.out.println("U gaat in nog een attractie");
				break;
			case "nee":
				System.out.println("Bedankt voor uw bezoek! We hopen u nog eens te zien");
				kermisapplicatie.nieuweAttractie = false;
			}
			}
	}
