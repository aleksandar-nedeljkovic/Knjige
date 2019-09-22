package knjige;

public class ListPapira {
	private int redniBroj;
	private String tekst;
	
	public ListPapira(int redniBroj, String tekst) {
		super();
		this.redniBroj = redniBroj;
		this.tekst = tekst;
	}

	public int getRedniBroj() {
		return redniBroj;
	}	
	public static boolean poredjenje (ListPapira a, ListPapira b) {
	return a.redniBroj >= b.redniBroj;
	}
	public boolean poredjenje (ListPapira a) {
		return this.redniBroj >= a.redniBroj;
	}

	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "ListPapira [redniBroj=" + redniBroj + ", tekst=" + tekst + "]";
	}
	

}
