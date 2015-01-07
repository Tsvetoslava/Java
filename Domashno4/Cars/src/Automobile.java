
public class Automobile extends Car{

	double expense;
	
	
	
	public Automobile(){
		super();
		this.expense=0;
	}
	
	public Automobile(double price,double expense){
		super(price);
		this.expense=expense;
	}

	@Override
	public String toString() {
		return "Automobile [expense=" + this.expense + ", price=" + super.price + "]";
	}
	
}
