import java.util.ArrayList;


public class Main {
public static void main(String[] args) {
	
	Student1 s1=new Student1("Ivan","Ivanov", 121213210, 42);
	Student1 s2=new Student1("Petur","Ivanov", 121213645, 42);
	Student1 s3=new Student1("Georgi","Ivanov", 121213231, 42);
	Student1 s4=new Student1("MAria","Ivanova", 121213312, 42);
	Student1 s5=new Student1("Ivan","Ivanov", 121213315, 42);
	ArrayList<Student1> studenti = new ArrayList<Student1>();
	
	
	studenti.add(s1);
	studenti.add(s2);
	studenti.add(s3);
	studenti.add(s4);
	studenti.add(s5);
	
	for (Student1 student1 : studenti) {
	System.out.println(student1.toString());
	}
}
}
