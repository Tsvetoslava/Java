/*Направете клас Employee който съдържа базовите характеристики
за един работник: часове работа на месец и месечна заплата
Направете клас Policeman, който наследява Employee и 
добавя поле за полицейския ранк на дадения полицай
Направете клас Doctor, който наследява Employee и 
добавя полета за броя нощни и броя целодневни дежурства на месец
Направете нужните get/set методи както и методи за 
извеждане на информацията за обектите в конзолата.
 */

public class Employee {
	private double zaplata;
	private int chasove;

	public Employee() {
		this.chasove = 0;
		this.zaplata = 0.0;
	}

	public Employee(int chasove, double zaplata) {
		this();
		setChasove(chasove);
		setZaplata(zaplata);
	}

	@Override
	public String toString() {
		return " chasove " + getChasove() + "  i zaplata " + getZaplata();
	}

	public int getChasove() {
		return chasove;
	}

	public void setChasove(int chasove) {
		this.chasove = chasove;
	}

	public double getZaplata() {
		return zaplata;
	}

	public void setZaplata(double zaplata) {
		this.zaplata = zaplata;
	}
}
