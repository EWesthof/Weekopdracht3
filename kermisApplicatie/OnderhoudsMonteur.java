package kermisApplicatie;

import java.util.Scanner;

public class OnderhoudsMonteur {
	void onderhouden(RisicoRijkeAttracties risicoRijkeAttractie) {
		System.out.println("De attractie heeft een onderhoudsbeurt nodig. Druk op m om de monteur erbij te halen");
		Scanner onderhoud = new Scanner(System.in);
		String beurt = onderhoud.nextLine();
		if (beurt.equals("m")){
		risicoRijkeAttractie.opstellingsKeuring();
		}
	}
}
