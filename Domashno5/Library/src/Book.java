/*Направете клас книга с име, автор и брой страници.
Направете клас библиотека, който съдържа полета
за име, адрес, и колекция от книги.  
Книгите в библиотеката могат да имат няколко
копия. Направете метод, който добавя книга(копие).
Направете метод, който премахва книга(копие). 
Направете метод който връща броя на всички книги(копия)
в библиотеката. Подберете подходящите структури от
данни за реализация на задачата
 */
public class Book {
	private String ime;
	private String avtor;
	private int stranici;

	public Book() {
		this.ime = "";
		this.avtor = "";
		this.stranici = 0;
	}

	public Book(String ime, String avtor, int stranici) {
		this();
		setIme(ime);
		setAvtor(avtor);
		setStranici(stranici);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getAvtor() {
		return avtor;
	}

	public void setAvtor(String avtor) {
		this.avtor = avtor;
	}

	public int getStranici() {
		return stranici;
	}

	public void setStranici(int stranici) {
		this.stranici = stranici;
	}

	@Override
	public String toString() {
		return "Book [getIme()=" + getIme() + ", getAvtor()=" + getAvtor()
				+ ", getStranici()=" + getStranici() + "]";
	}
}
