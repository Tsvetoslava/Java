/*Направете програма която приема дума от конзолата
 и извежда номера на всяка нейна буква
 */

import java.util.Scanner;

public class Letters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi duma");
		String word = sc.next();
		char[] symbol = word.toCharArray();

		for (int i = 0; i < symbol.length; i++) {
			System.out.printf("%s-nomer  %d", symbol[i], i + 1);
			System.out.println();
		}
		sc.close();
	}
}
