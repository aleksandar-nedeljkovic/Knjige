package knjige;

public class Police {
	private Knjiga[] knjige;
	private int brojKnjiga;
	
	public Police() {
		super();
		knjige = new Knjiga[10];
	}
	public void dodajKnjigu (Knjiga knjiga) {
		if(brojKnjiga < 0 || brojKnjiga >= knjige.length) {
			return;
		}
		knjige[brojKnjiga++]=knjiga;
	}
	
	public Knjiga getKnjiga(String naziv) {
		for (int i = 0; i < knjige.length; i++) {
			if (knjige[i].getNaziv() == naziv) {
				return knjige[i];
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Knjiga knjiga : knjige) {
			if (knjiga != null) {
			sb.append(knjiga).append("\n");}
		}
		return sb.toString();
	}

}
