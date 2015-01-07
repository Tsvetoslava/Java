
public class Student extends Human{

	protected String univercity;
	protected String specialty;
	
	
	public Student(){
		super();
		this.specialty="";
		this.univercity="";
	}
	
	public Student(String name,String univercity,String specialty){
		super(name);
		setUnivercity(univercity);
		setSpecialty(specialty);
		
	}
	
	public void setUnivercity(String univercity){
		this.univercity=univercity;
	}
	public void setSpecialty(String specialty){
		this.specialty=specialty;
	}
	
	public void identify() {
	
		System.out.println("Name: "+ super.getName()+"  Specialty:  "+this.specialty +
				" univercity: "+this.univercity);
	}

	
	
}
