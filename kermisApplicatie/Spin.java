package kermisApplicatie;

class Spin extends RisicoRijkeAttracties implements GokAttractie {
	Spin(){
		this.naam = "Spin";
		this.prijs = 2.25;
		this.oppervlakte = 10;
		this.omzetAttractie = 0;
	
	}

	@Override
	void opstellingsKeuring() {
		System.out.println("Hoera, de attractie " + this.naam + " is weer goedgekeurd!");
		
	}

	@Override
	public double kansSpelBelastingBetalen() {
			double belasting = this.omzetAttractie * 0.3;
			return belasting;
		}
	}
