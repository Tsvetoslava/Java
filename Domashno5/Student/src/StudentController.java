/*Напрате клас Student, който съдържа полета: име, фамилия, номер,
както и HashMap, който да съдържа всички негови предмети и съответно оценки по тях.
Реализирайте метод addSubjectMark, който добавя оценка към определен предмет
Направете метод calculateAvarageMark(), който приема предмет и връща средния успех по предмета.
Демонстрирайте класа като създадете 3 ученика с поне по 5 предмета и 3 оценки по всеки от тях
 */

import java.util.ArrayList;
import java.util.Arrays;

public class StudentController {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getOcenki()
				.put("Ikonomika", new ArrayList<>(Arrays.asList(5, 6, 6)));
		s1.getOcenki().put("Biologiq", new ArrayList<>(Arrays.asList(3, 3, 3)));
		s1.getOcenki().put("Matematika",
				new ArrayList<>(Arrays.asList(2, 5, 4)));
		s1.getOcenki().put("Himiq", new ArrayList<>(Arrays.asList(2, 4, 4)));
		s1.getOcenki().put("Istoriq", new ArrayList<>(Arrays.asList(3, 4, 4)));

		Student s2 = new Student();
		s2.getOcenki().put("Himiq", new ArrayList<>(Arrays.asList(3, 4, 6)));
		s2.getOcenki().put("Istoriq", new ArrayList<>(Arrays.asList(6, 6, 6)));
		s2.getOcenki().put("Georgrafiq",
				new ArrayList<>(Arrays.asList(4, 4, 4)));
		s2.getOcenki()
				.put("Ikonomika", new ArrayList<>(Arrays.asList(5, 5, 4)));
		s2.getOcenki().put("BG", new ArrayList<>(Arrays.asList(3, 3, 5)));

		Student s3 = new Student();
		s3.getOcenki().put("Sport", new ArrayList<>(Arrays.asList(4, 3, 3)));
		s3.getOcenki()
				.put("Geografiq", new ArrayList<>(Arrays.asList(5, 4, 5)));
		s3.getOcenki().put("Istoriq", new ArrayList<>(Arrays.asList(6, 4, 6)));
		s3.getOcenki().put("Biologiq", new ArrayList<>(Arrays.asList(6, 6, 6)));
		s3.getOcenki().put("Matematika",
				new ArrayList<>(Arrays.asList(6, 4, 6)));

		for (String key : s1.getOcenki().keySet()) {
			System.out.println(key + s1.getOcenki().get(key));
		}

		for (String key : s2.getOcenki().keySet()) {
			System.out.println(key + s2.getOcenki().get(key));
		}

		for (String key : s3.getOcenki().keySet()) {
			System.out.println(key + s3.getOcenki().get(key));
		}
	}
}
