
class Demo{
	    public static void main(String[] args) {
	    	System.out.println("Welkom");
	    	ToegangsPoort tp = new ToegangsPoort();
	    	Persoon persoon = new Persoon();
	    	persoon.naam = "Fred";
	    	int a = 24;
	    	tp.toelaten(persoon);   // argument
	    	cijferNoemen(23);
	    }
	    static void cijferNoemen(int getal) {
	    	System.out.println(getal);
	    }
}
class ToegangsPoort{
	void toelaten(Persoon dePersoon) {  // parameter
		if (true) {
			System.out.println("je bent toe gelaten, welkom "+dePersoon.naam);
		}else {
			System.out.println("je bent niet toegelaten");
		}
	}
}
class Persoon{
	String naam;
//	Pasje pasje;
}


/*
class ToegangsPoort{
	toegangGeven() Mens
	
}

class Mens{
	Pasje
	
}

class Pasje
{
	boolean geblokkerd
}
class Beveiliger{
	updaten(){}   // mens pasje
	Pasje uitgeven();
}

*/
