/*Направете програма, която приема дума от 5 символа.
След това програмата приема 5 отделни символа. 
Изведете дали може да бъде образувана думата 
от 5те символа които сте въвели
 */

import java.util.Scanner;

public class SymbolFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		System.out.println("Vuvedi 5 simvolna duma: ");
		String word = sc.nextLine();
		if (word.length() > 6) {
			System.out.println("nevalidna duma");
		}
		char[] arr = word.toCharArray();
		char[] array = new char[5];

		System.out.println("Vuvedi 5 simvola: ");
		for (int j = 0; j < array.length; j++) {
			array[j] = sc.next().charAt(0);
		}

		for (char c : arr) {
			System.out.print(c);
		}
		System.out.println();

		for (char c : array) {
			System.out.print(c);
		}
		print(arr, array, counter);
		sc.close();
	}

	public static void print(char[] arr, char[] array, int counter) {
		for (int i = 0; i < array.length; i++) {
			counter++;
			if (array[0] == arr[i] || array[1] == arr[i] || array[2] == arr[i]
					|| array[3] == arr[i] || array[4] == arr[i]) {
				System.out.print(" sumvolut suvpada, ");
			} else {
				System.err.println("     ne moje da se obrazuvana duma");
				break;
			}
			if (counter == 5) {
				System.out.println();
				System.out.println("Moje da se obrazuva duma");
			}
		}
	}
}
