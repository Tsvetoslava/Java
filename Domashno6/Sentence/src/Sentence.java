/*��������� �������� ����� ������ ��������� ���� ���� � ������� � ���������
 ������ �� ����������� � ������� ��� ���� �������� �������������� �����.
 */

import java.util.Scanner;

class Sentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi izrechenie: ");
		String sentence = sc.nextLine();
		String[] parts = sentence.split(" |,|!");

		for (int i = parts.length - 1; i >= 0; i--) {
			System.out.println(parts[i]);
		}
	}
}
