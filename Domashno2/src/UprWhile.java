/*��������� ��������, ����� ������� �� ��������� ������ ����� �� 1 �� 100 ����� �� �����
��� �� 7 ��� �� 11 ��� �������.
������ �������� �� 3 �������� ������ ��������� � ����� ����� �� ��������
 */
import java.util.Scanner;

public class UprWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vuvedi 1 chislo");
		int number1 = sc.nextInt();
		System.out.println("vuvedi 2 chislo");
		int number2 = sc.nextInt();
		int counter = 1;

		while (counter <= 100) {
			if (counter % number1 == 0 || counter % number2 == 0) {
				System.out.println(counter);
			}
			counter++;
		}
	}
}
