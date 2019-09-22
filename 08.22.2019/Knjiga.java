package knjige;

public class Knjiga {
	private String naziv;
	private ListPapira[] straniceKnjige;
	private int brojListova = 0;
	
	public Knjiga(String naziv) {
		super();
		this.naziv = naziv;
		this.straniceKnjige = new ListPapira[5];
	}
	

	
	public void dodaj (ListPapira lp) {
		if(lp.getRedniBroj() < 0) {
			return;
}
		if (lp.getRedniBroj() > straniceKnjige.length) {
			ListPapira[] temp = new ListPapira[straniceKnjige.length];
			int i = 0;
			for (ListPapira l : straniceKnjige) {
				temp[i] = l;
				i++;
			}
			straniceKnjige = temp;
		}
		
	}
	public int getBrojListova() {
		return brojListova;
	}
	public ListPapira dohvati (int rb) {
		if (rb < 0 || rb >= straniceKnjige.length)
			return null;
			return straniceKnjige[rb];
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (ListPapira lp : straniceKnjige) {
			sb.append(lp).append("\n");
		}
		return naziv + "\n" + sb.toString();
	}



	public String getNaziv() {
		return naziv;
	}
	
}
