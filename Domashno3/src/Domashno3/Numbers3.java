/*Дефинирайте фунцкия която приема 3 параметъра - цели числа и ги умножава едно с друго.
 Извикайте функцията 20 пъти с рандом генерирани параметри. Изведете резултата на екрана
 */

package Domashno3;

import java.util.Random;
import java.util.Scanner;

public class Numbers3 {

	// public static void main(String[] args) {

	// int number3=0;
	// int number1=0;
	// int number2=0;
	// umnojenie(number1,number2,number3);
	// }

	public static void umnojenie(int number1, int number2, int number3) {
		Random rand = new Random();

		for (int i = 1; i <= 20; i++) {
			number1 = rand.nextInt();
			number2 = rand.nextInt();
			number3 = rand.nextInt();
			int rezultat = number1 * number2 * number3;
			System.out.println("Rezultat ot umnojenieto na tri chisla: "
					+ rezultat);
		}
	}
}
