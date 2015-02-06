/*Направете програма която принтира числата от 
 1 до 20 на 5 реда и 4 колони както е показано на картинката:
*/

import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi purvo chislo :");
		int number1 = sc.nextInt();
		System.out.println("Vuvedi vtoro chislo :");
		int number2 = sc.nextInt();

		System.out.println("Chislata mejdu dvete cifri,koito se delqt na 3 sa: ");
		for (int counter = number1; counter <= number2; counter++) {
			if (counter % 3 == 0) {
				System.out.println(counter);
			}
		}
		sc.close();
	}
}
