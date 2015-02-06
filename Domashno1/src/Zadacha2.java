/* програма, която приема 3 цели числа. Изведете на конзолата
дали може да бъде бъде образуван триъгълник с дължини на страните съответни 3 числа.
 */

import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Vuvedi purvo chislo");
		int number1 = sc.nextInt();
		System.out.println("Vuvedi vtoro chislo");
		int number2 = sc.nextInt();
		System.out.println("Vuvedi treto chislo");
		int number3 = sc.nextInt();

		if ((number1 > number2 && number1 > number3)
				|| (number2 > number3 && number2 > number1)
				|| (number3 > number1 && number3 > number2)) {
			System.out.println("Ne moje da bude obrazuvam takuv triugulnik");
		} else {
			System.out.println("Moje da bude obrazuvan takuv triugulnik");
		}
		sc.close();
	}
}
