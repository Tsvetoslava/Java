/*Направете програма, която приема 20 думи и принтира
на екрана думите които са въведени повече от един път
 */
import java.util.Scanner;

public class dumi {

	public static void main(String[] args) {
		String[] array = new String[20];
		Scanner sc = new Scanner(System.in);
		int counter = 1;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Vuvedi " + counter + " duma: ");
			String duma = sc.next();
			array[i] = new String(duma);
			counter++;
		}

		for (int k = 0; k < 20; k++) {
			for (int j = 0; j < k; j++) {
				if (array[k].equals(array[j])) {
					System.out.print(" " + array[k]);
				}
			}
		}
		sc.close();
	}
}
