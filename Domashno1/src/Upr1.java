/*Направете програма, която чете от конзолата 1 string и 2 целочислени числа.
Проверете и изкарайте на конзолата
Дали размера на string е по-голям от 10
Дали първото число е по-голямо от второто
Дали второто число е в интервала [-100; 15)
Остатъкът от деленето на първото число с второто
Резултатът от логическата операция – Дали първото число е по-голямо от 10 или второто число е по-малко от 88
 */

import java.util.Scanner;

public class Upr1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("vuvedi 1 chislo");
		int number1 = sc.nextInt();
		System.out.println("vuvedi 2 chislo");
		int number2 = sc.nextInt();
		System.out.println("vuvedi string");
		String string = sc.next();

		stringLength(string);
		sravnenie(number1, number2);
		interval(number2);
		opstatuk(number1, number2);
		logOperaciq(number1, number2);
		sc.close();
	}

	public static void stringLength(String string) {
		boolean strLength = string.length() > 10;
		System.out.println("Дали размера на string е по-голям от 10");
		System.out.println(strLength);
		System.out.println();
	}

	public static void sravnenie(int number1, int number2) {

		boolean sravnenie = number1 > number2;
		System.out.println(" a > b");
		System.out.println(sravnenie);
		System.out.println();
	}

	public static void interval(int number2) {

		boolean boolinterval = (number2 >= -100 && number2 < 15);
		System.out.println("Дали второто число е в интервала [-100; 15)");
		System.out.println(boolinterval);
		System.out.println();
	}

	public static void opstatuk(int number1, int number2) {

		int boolOstatuk = number1 % number2;
		System.out.println("Остатъкът от деленето на първото число с второто");
		System.out.println(boolOstatuk);
		System.out.println();
	}

	public static void logOperaciq(int number1, int number2) {

		boolean boolLog1 = (number1 > 10);
		boolean boolLog2 = (number2 < 88);
		System.out.println("Резултатът от логическата операция –"
				+ " Дали първото число е по-голямо от 10 или второто"
				+ " число е по-малко от 88");
		System.out.println(boolLog1 || boolLog2);
	}
}
