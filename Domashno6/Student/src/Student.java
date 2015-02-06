/*Направете клас Student съдържащ име, фамилия, факултетен номер и група.
   Имплементирайте метода toString като в него връщайте пълната информация
   за студента. Направете лист от 5 студента, обходете го като за всеки 
   студент от него изкарвате пълната информация на екрана
 */

public class Student {
	private String ime;
	private String familiq;
	private int fakN;
	private int gr;

	public Student() {
		super();
	}

	public Student(String ime, String familiq, int fakN, int gr) {
		super();
		this.ime = ime;
		this.familiq = familiq;
		this.fakN = fakN;
		this.gr = gr;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getFamiliq() {
		return familiq;
	}

	public void setFamiliq(String familiq) {
		this.familiq = familiq;
	}

	public int getFakN() {
		return fakN;
	}

	public void setFakN(int fakN) {
		this.fakN = fakN;
	}

	public int getGr() {
		return gr;
	}

	public void setGr(int gr) {
		this.gr = gr;
	}

	@Override
	public String toString() {
		return " [getIme()=" + getIme() + ", getFamiliq()=" + getFamiliq()
				+ ", getFakN()=" + getFakN() + ", getGr()=" + getGr() + "]";
	}
}
