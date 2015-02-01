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

public class Student extends Human {
	protected String univercity;
	protected String specialty;

	public Student() {
		super();
		this.specialty = "";
		this.univercity = "";
	}

	public Student(String name, String univercity, String specialty) {
		super(name);
		setUnivercity(univercity);
		setSpecialty(specialty);

	}

	public void setUnivercity(String univercity) {
		this.univercity = univercity;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void identify() {

		System.out.println("Name: " + super.getName() + "  Specialty:  "
				+ this.specialty + " univercity: " + this.univercity);
	}
}
