/*Направете програма която извлича от подаден текст всички изречения, 
  които съдържат дадена дума
 */

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi duma: ");
		String word = sc.nextLine();
		System.out.println("Vuvedi text ");
		String text = sc.nextLine();
		String[] parts = text.split("\\.");

		for (int i = 0; i < parts.length; i++) {
			int contains = parts[i].indexOf(word);
			if (contains > 0) {
				System.out.println("Izrecheniqta s tazi duma sa:  " + parts[i]);
			}
		}
		sc.close();
	}
}
