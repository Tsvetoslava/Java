/*��������� ��������, ����� ���� �� ��������� 3 ����� � ������� 
 ��� � ���-�������� � ��� � ���-������� ����� �� �����
 */

import java.util.Scanner;

public class Upr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislata");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		System.out.println("Nai-golqmo");
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println(number2);
		} else {
			System.out.println(number3);
		}

		System.out.println("nai-malko");
		if (number1 < number2 && number1 < number3) {
			System.out.println(number1);
		} else if (number2 < number1 && number2 < number3) {
			System.out.println(number2);
		} else {
			System.out.println(number3);
		}
	}
}
