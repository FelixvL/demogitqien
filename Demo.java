
class Demo{
	    public static void main(String[] args) {
	    	System.out.println("Welkom");
	    	ToegangsPoort tp = new ToegangsPoort();
	    	tp.toelaten();
	    	
	    }
}
class ToegangsPoort{
	void toelaten() {
		if (false) {
		System.out.println("je bent toe gelaten?");
		}else {
			System.out.println("je bent niet toegelaten");
		}
	}
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
