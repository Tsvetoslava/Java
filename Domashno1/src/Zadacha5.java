/*Създайте програма, която изчислява бонус точки на база резултат от игра.
 *  Потребителят трябва да въведе своите точни в интервалa[1,;9].
 *  Ако точките са в интервала [1;3] Умножете ги по 5.
 *  Ако точките са в интервала [4;6] Умножете ги по 10. 
 *  Ако точките са в интервала [7;9] Умножете ги по 50. 
 *  Резултатът изведете на екрана
 */

import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi chislo ot [1-9]");
		int number = sc.nextInt();

		if (number < 1 || number > 9) {
			System.out.println("Error");
		}

		if (number > 0 && number < 4) {
			number = number * 5;
			System.out.println("Rezultat: " + number);
		} else if (number > 3 && number < 7) {
			number = number * 10;
			System.out.println("Rezultat: " + number);
		} else if (number > 6 && number < 10) {
			number = number * 50;
			System.out.println("Rezultat: " + number);
		}
	}
}
