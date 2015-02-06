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

public class Pensioner extends Human {
	private double pension;

	public Pensioner() {
		super();
		this.pension = 0.0;
	}

	public Pensioner(String name, double pension) {
		super(name);
		setPension(pension);
	}

	public void setPension(double pension) {
		this.pension = pension;
	}

	public double getPension() {
		return pension;
	}

	@Override
	public void identify() {
		System.out.println("Pensioner: " + getName() + " pension:  "
				+ getPension());
	}
}
