/*Направете програма която приема дума а след това текст. 
 Изведете на екрана текста като замениете всяко срещане на думата 
 с нейният вариянт в uppercase
 */

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi duma: ");
		String word = sc.nextLine();
		System.out.println("Vuvedi text: ");
		String text = sc.nextLine();
		String upperC = word.toUpperCase();
		String modified = text.replace(word, upperC);
		System.out.println(modified);
	}
}
