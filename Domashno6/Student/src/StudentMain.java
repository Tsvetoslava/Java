/*Направете клас Student съдържащ име, фамилия, факултетен номер и група.
   Имплементирайте метода toString като в него връщайте пълната информация
   за студента. Направете лист от 5 студента, обходете го като за всеки 
   студент от него изкарвате пълната информация на екрана
 */

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Ivan", "Ivanov", 121213210, 42);
		Student student2 = new Student("Petur", "Ivanov", 121213645, 42);
		Student student3 = new Student("Georgi", "Ivanov", 121213231, 43);
		Student student4 = new Student("Maria", "Ivanova", 121213312, 40);
		Student student5 = new Student("Ivan", "Ivanov", 121213315, 42);
		ArrayList<Student> studenti = new ArrayList<Student>();

		studenti.add(student1);
		studenti.add(student2);
		studenti.add(student3);
		studenti.add(student4);
		studenti.add(student5);

		for (Student student : studenti) {
			System.out.println(student.toString());
		}
	}
}
