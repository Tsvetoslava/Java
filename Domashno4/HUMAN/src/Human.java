
public abstract class Human {

	
	protected String name;
	
	
	public Human(){
		this.name="";
	}
	
	public Human(String name){
		setName(name);
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public abstract void identify();
	
}
