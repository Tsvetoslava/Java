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

public abstract class Human {
	protected String name;

	public Human() {
		this.name = "";
	}

	public Human(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void identify();
}
