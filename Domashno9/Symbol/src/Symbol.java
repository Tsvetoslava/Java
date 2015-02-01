/*Направете програма която чете поредица от символи и
 замества поредните повтарящи се символи със съответния 
 символ повтарящ се само веднъж:
 Пример:
“gggggssssstttttsssssaaaaa"  “gsts".

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Symbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String izraz = sc.nextLine();
		char[] izrazChar = izraz.toCharArray();

		for (int i = 0; i < izrazChar.length - 1; i++) {

			int first = izrazChar[i];
			int second = izrazChar[i + 1];

			if (first != second) {

				System.out.print(izrazChar[i]);
			}
		}
	}
}