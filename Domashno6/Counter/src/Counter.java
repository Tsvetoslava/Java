/*Направете програма, която приема текст, а след това дума и 
 принтира на екрана колко пъти се среща съответната дума
 */
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi duma: ");
		String word = sc.nextLine();
		System.out.println("Vuvedi text");
		String text = sc.nextLine();
		int counter = 0;
		String[] parts = text.split("\\W+");

		for (int i = 0; i < parts.length; i++) {
			if (word.equals(parts[i])) {
				counter++;
			}
		}
		System.out.println("Dumata se sreshta: " + counter);
		sc.close();
	}
}
