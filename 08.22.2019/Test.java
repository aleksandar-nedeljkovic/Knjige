package knjige;

public class Test {

	public static void main(String[] args) {
		
		ListPapira lp1 = new ListPapira (01, "Stranica 1");
		ListPapira lp2 = new ListPapira (02, "Stranica 2");
		ListPapira lp3 = new ListPapira (03, "Stranica 3");
		
		lp1.setRedniBroj(3);
		
		Knjiga k1 = new Knjiga("The Lord Of The Rings");
		Knjiga k2 = new Knjiga("Unfinished Tails");
		Knjiga k3 = new Knjiga("Silmarilion");
		

	}

}
