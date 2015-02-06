/*Направете клас Employee който съдържа базовите характеристики
за един работник: часове работа на месец и месечна заплата
Направете клас Policeman, който наследява Employee и 
добавя поле за полицейския ранк на дадения полицай
Направете клас Doctor, който наследява Employee и 
добавя полета за броя нощни и броя целодневни дежурства на месец
Направете нужните get/set методи както и методи за 
извеждане на информацията за обектите в конзолата.
 */

public class Policeman extends Employee {
	private String rank;

	public Policeman() {
		super();
		this.rank = "";
	}

	public Policeman(String rank, int chasove, double zaplata) {
		super(chasove, zaplata);
		setRank(rank);
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return "Policeman: rankut e  " + getRank() + super.toString();
	}
}
