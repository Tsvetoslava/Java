package Slujitel;

public class Slujitel {

	private String ime;
	private String familiq;
	private String nomer;
	private int godini;
	private int zaplata;

	public Slujitel() {

	}

	public Slujitel(String ime, String familiq, String nomer, int godini,
			int zaplata) {
		super();
		this.ime = ime;
		this.familiq = familiq;
		this.nomer = nomer;
		this.godini = godini;
		this.zaplata = zaplata;
	}

	public Slujitel(String text, String text2, int phoneNumber, int age,
			int salary) {

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getNomer() {
		return nomer;
	}

	public void setNomer(String nomer) {
		this.nomer = nomer;
	}

	public int getGodini() {
		return godini;
	}

	public void setGodini(int godini) {
		this.godini = godini;
	}

	public int getZaplata() {
		return zaplata;
	}

	public void setZaplata(int zaplata) {
		this.zaplata = zaplata;
	}

	public String getFamiliq() {
		return familiq;
	}

	public void setFamiliq(String familiq) {
		this.familiq = familiq;
	}

	@Override
	public String toString() {
		return "Slujitel: ime=" + ime + ", nomer=" + nomer + ", godini="
				+ godini + ", zaplata=" + zaplata + "]";
	}
}
