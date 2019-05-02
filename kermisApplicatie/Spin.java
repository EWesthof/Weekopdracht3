package kermisApplicatie;

class Spin extends RisicoRijkeAttracties implements GokAttractie {
	Spin(){
		this.naam = "Spin";
		this.prijs = 2.25;
		this.oppervlakte = 10;
		this.omzetAttractie = 0;
		this.kaartjes=0;
	
	}
	
	@Override
	void draaien(Attractie attractie) throws Exception{
		if (this.kaartjes % 5 != 0) {
		System.out.println("Je zit nu in de " + attractie.naam);
		}
		else {
			throw new Exception("Je moet een onderhoudsbeurt");
		}
	}
		

	@Override
	void opstellingsKeuring() {
		System.out.println("Hoera, de attractie " + this.naam + " is weer goedgekeurd! De attractie draait!");
		
	}

	@Override
	public double kansSpelBelastingBetalen() {
			double belasting = this.omzetAttractie * 0.3;
			return belasting;
		}
	}
