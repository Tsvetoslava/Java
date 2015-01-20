import java.util.ArrayList;


public class StudentMain {
	public static void main(String[] args) {
		
		Student s1=new Student("Ivan","Ivanov", 121213210, 42);
		Student s2=new Student("Petur","Ivanov", 121213645, 42);
		Student s3=new Student("Georgi","Ivanov", 121213231, 43);
		Student s4=new Student("Maria","Ivanova", 121213312, 40);
		Student s5=new Student("Ivan","Ivanov", 121213315, 42);
		ArrayList<Student> studenti = new ArrayList<Student>();
		
		
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		studenti.add(s4);
		studenti.add(s5);
		
		for (Student student : studenti) {
		System.out.println(student.toString());
		}
	}
}
