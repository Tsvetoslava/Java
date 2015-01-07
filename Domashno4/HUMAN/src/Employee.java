
public class Employee extends Human{

	protected double salary;
	protected String place;
	
	
	public Employee(){
		super();
		this.place="";
		this.salary=0.0;
	}
	
	public Employee(String name,String place,double salary){
		super(name);
		setSalary(salary);
		setPlace(place);
	}
	
	
	
	public void setPlace(String place){
		this.place=place;
	}
	
	public void setSalary(Double salary){
		this.salary=salary;
	}
	
	public String getPlace(){
		return place;
	}
	public Double getSalary(){
		return salary;
	}
	
	@Override
	public void identify() {
		System.out.println("Employee "+ super.getName()+ ", place: "+getPlace()+
				", salary: "+getSalary());
		
	}

	
	
	
	
}
