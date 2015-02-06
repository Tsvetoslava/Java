/*Създайте абстрактен клас HUMAN съдържащ поле
за име и един абстрактен метод identify. 
Създайте клас Student който наследява Human и 
съдържа полета за университет и специалност
Създайте клас Employee който наследява Human и 
съдържа полета за месторабота и месечна заплата
Създайте клас Pensioner който наследява Human и 
съдържа поле за пенсия.И в трите класа дайте
 различна имплементация на метода indentify 
като изкарвате информация за съответния обект в конзолата
 */

public class HumanController {

	public static void main(String[] args) {
		Employee e1 = new Employee("Petur", "TU", 800);
		Student s1 = new Student("Stoqn", "TU", "KSI");
		Pensioner p1 = new Pensioner("Ivan", 350);

		s1.identify();
		e1.identify();
		p1.identify();
	}
}
