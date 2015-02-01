/*��������� ��������, ����� ���� �� ��������� 1 string � 2 ����������� �����.
��������� � ��������� �� ���������
���� ������� �� string � ��-����� �� 10
���� ������� ����� � ��-������ �� �������
���� ������� ����� � � ��������� [-100; 15)
��������� �� �������� �� ������� ����� � �������
���������� �� ����������� �������� � ���� ������� ����� � ��-������ �� 10 ��� ������� ����� � ��-����� �� 88
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
	}

	public static void stringLength(String string) {
		boolean strLength = string.length() > 10;
		System.out.println("���� ������� �� string � ��-����� �� 10");
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
		System.out.println("���� ������� ����� � � ��������� [-100; 15)");
		System.out.println(boolinterval);
		System.out.println();
	}

	public static void opstatuk(int number1, int number2) {

		int boolOstatuk = number1 % number2;
		System.out.println("��������� �� �������� �� ������� ����� � �������");
		System.out.println(boolOstatuk);
		System.out.println();
	}

	public static void logOperaciq(int number1, int number2) {

		boolean boolLog1 = (number1 > 10);
		boolean boolLog2 = (number2 < 88);
		System.out.println("���������� �� ����������� �������� �"
				+ " ���� ������� ����� � ��-������ �� 10 ��� �������"
				+ " ����� � ��-����� �� 88");
		System.out.println(boolLog1 || boolLog2);
	}
}
