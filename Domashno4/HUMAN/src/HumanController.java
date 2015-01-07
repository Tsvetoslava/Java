
public class HumanController {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Petur", "TU", 800);
		Student s1=new Student("Stoqn", "TU", "KSI");
		Pensioner p1=new Pensioner("Ivan",350);
		
		s1.identify();
		e1.identify();
		p1.identify();
		
		
		
		
	}
}
