/*Направете програма която приема брой дни и изчислява
колко секунди представляват тези дни. Опитайте 
се да използвате обектно ориентиран подход при решението на задачата
 */
public class Days {
	private final int hours = 24;
	private final int minutes = 60;
	private final int seconds = 60;
	int days;

	public Days() {
		this.days = 0;
	}

	public Days(int days) {
		this();
		setDays(days);
	}

	public void setDays(int days) {
		if (days >= 0) {
			this.days = days;
		}
	}

	public int getDays() {
		return days;
	}

	public int printDays() {
		int sec = this.days * hours * minutes * seconds;
		return sec;
	}
}
