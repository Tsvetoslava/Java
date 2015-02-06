/*Да се състави програма на JAVA, която извежда сумата
на всички числа от интервала 1 до въведено от конзолата
число. Числото трябва да е в интервала [10 - 30000].
Използвайте рекурсия за решението на задачата
 */

package Domashno3;

import java.util.Scanner;

public class Upr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi chislo v intervala [10-30 000]:");
		int number = sc.nextInt();
		if (number >= 10 && number <= 30000) {
			rekursiq(number);
			System.out.println(rekursiq(number));
		} else {
			System.out.println("Chisloto ne e v intervala");
		}
		sc.close();
	}

	public static int rekursiq(int number) {
		if (number == 0) {
			return 0;
		} else {
			return number + rekursiq(number - 1);
		}
	}
}
