
public class Person {

	private String name;
	private int age;
	private String email;
	public static int counter;
	
	public Person() {
		String name="";
		int age=0;
		String email="";
		counter++;
	}
	
	
		public Person(String name, int age, String email) {
		this();
		setName(name);
		setAge(age);
		setEmail(email);
	}
	
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getEmail()=" + getEmail() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=3){
		this.name = name;
		}	
		
			}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0 && age<201){
			
		this.age = age;
		}
	
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length()>=3){
			this.email = email;
		}
		
	}


	public static void counter() {
		
		System.out.println(counter);
		
	}

	
}
