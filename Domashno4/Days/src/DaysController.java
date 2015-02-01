/*Направете програма която приема брой дни и изчислява
колко секунди представляват тези дни. Опитайте 
се да използвате обектно ориентиран подход при решението на задачата
 */

public class DaysController {

	public static void main(String[] args) {
		Days day1 = new Days(2);
		Days day2 = new Days(3);

		System.out.println(day1.days + " dni imat " + day1.printDays() + "sek.");
		System.out.println(day2.days + " dni imat " + day2.printDays() + "sek.");
	}
}
