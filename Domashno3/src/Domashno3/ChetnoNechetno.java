/*����������� ������� ����� ������ 1 ��������� - �����
 � �������� �� ������ "�����" ��� ������� � ����� � 
 "�������" ��� ������� � �������. �������������� ���������� 
 �� �������� � ��������������
 */
package Domashno3;

import java.util.Scanner;

public class ChetnoNechetno {

	// public static void main(String[] args) {

	// int number=0;
	// int broi=0;
	// print(number);
	// }

	public static void print(int number) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi kolko puti iskash da se izpolzva funkciqta");
		int broi = sc.nextInt();
		for (int i = 0; i < broi; i++) {
			System.out.println("*******");
			System.out.println("Vuvedi chislo");
			number = sc.nextInt();

			if (number % 2 == 0) {
				System.out.println("Chisloto e chetno");
			} else {
				System.out.println("Chisloto e nechetno");
			}

		}
	}
}