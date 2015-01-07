
public class Pensioner extends Human{

	private double pension;
	
	
	public Pensioner(){
		super();
		this.pension=0.0;
		}
	public Pensioner(String name, double pension){
		super(name);
		setPension(pension);
	}
	
	public void setPension(double pension){
		this.pension=pension;
	}
	public double getPension(){
		return pension;
	}
	
	@Override
	public void identify() {
		System.out.println("Pensioner: "+getName()+ " pension:  "+getPension());
		
	}

}
