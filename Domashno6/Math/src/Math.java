/*Направете програма която чете от конзолата математически израз 
и проверява дали са поставени правилно скобите за приоритет:
 */

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String izraz = sc.nextLine();
		char[] arrIzraz = izraz.toCharArray();
		int count = 0;

		for (char c : arrIzraz) {
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
				if (count < 0) {
					System.out.println("Nevaliden izraz");
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
