/*Направете клас Employee който съдържа базовите характеристики
за един работник: часове работа на месец и месечна заплата
Направете клас Policeman, който наследява Employee и 
добавя поле за полицейския ранк на дадения полицай
Направете клас Doctor, който наследява Employee и 
добавя полета за броя нощни и броя целодневни дежурства на месец
Направете нужните get/set методи както и методи за 
извеждане на информацията за обектите в конзолата.
 */

public class EmployeeController {

	public static void main(String[] args) {
		Employee e1 = new Employee(3, 554.6);
		Doctor d1 = new Doctor(53, 6745, 3, 2);
		Policeman p1 = new Policeman("serjant", 24, 653);

		System.out.println("Employee: " + e1.toString());
		System.out.println(d1.toString());
		System.out.println(p1.toString());
	}
}
