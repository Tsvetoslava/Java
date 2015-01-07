
public class Vegetable extends Stock{


	private boolean isFresh;
	private String ime;
	
	
	
	
		public Vegetable(boolean isFresh, String ime,double price, boolean isAvailable) {
		super(price, isAvailable);
		setFresh(isFresh);
		setIme(ime);
	}
	public Vegetable() {
		super();
		this.ime="";
	    this.isFresh=false;
	}
	
	
	
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}	
	public boolean getIsFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Vegetable [getIme()=" + getIme() + ", getIsFresh()="
				+ getIsFresh() + "]";
	}
	
}
