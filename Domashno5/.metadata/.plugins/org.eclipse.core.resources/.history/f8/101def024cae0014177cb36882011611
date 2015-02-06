/*Направете програма, която приема текст и
извежда на екрана всички думи, които са
уникални (срещат се само веднъж)
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TextUnique {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		String[] words = text.split("\\W+");
		sc.close();

		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}
		Set<String> wordKeys = wordsCount.keySet();

		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			if (count == 1) {
				System.out.printf(word + " ");
			}
		}
	}
}