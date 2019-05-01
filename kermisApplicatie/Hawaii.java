package kermisApplicatie;

class Hawaii extends RisicoRijkeAttracties {
	Hawaii(){
		this.naam = "Hawaii";
		this.prijs = 2.90;
		this.oppervlakte = 7;
	}

	@Override
	void opstellingsKeuring() {
		System.out.println("De attractie " + this.naam + " is weer goedgekeurd!");
		
	}
}
