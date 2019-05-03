package kermisApplicatie;

class Hawaii extends RisicoRijkeAttracties {
	Hawaii(){
		this.naam = "Tropical Hawaii";
		this.prijs = 2.90;
		this.oppervlakte = 7;
	}

	@Override
	void opstellingsKeuring() {
		System.out.println("De attractie " + this.naam + " is weer goedgekeurd! De attractie draait");
		
	}
	
	@Override
	void draaien(Attractie attractie) throws Exception{
		if (this.kaartjes % 10 != 0) {
		System.out.println("Je zit nu in de " + attractie.naam);
		}
		else {
			throw new Exception("Je moet een onderhoudsbeurt");
		}
	}
}
