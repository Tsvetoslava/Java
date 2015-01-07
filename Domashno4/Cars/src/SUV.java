
public class SUV extends Car{

	boolean isHigh;
	
	public SUV(){
		super();
		this.isHigh=false;
	}
	
	public SUV(boolean isHigh,double price){
		super(price);
		this.isHigh=isHigh;
	}

	@Override
	public String toString() {
		return "SUV [isHigh=" + this.isHigh + ", price=" + super.price + "]";
	}
}
