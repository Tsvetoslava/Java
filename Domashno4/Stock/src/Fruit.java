
public class Fruit extends Stock{


private	boolean fresh;
	private String name;
	
	
	
	public Fruit() {
		super();
		this.fresh=false;
		this.name = "";
	}
	public Fruit(double price, boolean isAvailable,boolean fresh, String name) {
		super(price, isAvailable);
		setFresh(fresh);
		setName(name);
		
		
		
		
	}
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [isFresh()=" + isFresh() + ", getName()=" + getName()
				+ "]";
	}
	
	
	
	
}
