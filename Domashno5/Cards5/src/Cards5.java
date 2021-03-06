/*Направете програма, която приема 5 карти 
 от тестето за игра. Програмта трябва да извежда
 на екрана дали играчът има чифт, сет или каре.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Cards5 {

	public static void main(String[] args) {
		String[] cards = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < cards.length; i++) {
			System.out.println("Vuvedi " + (i + 1) + " karta");
			cards[i] = sc.nextLine();
		}
		proverka(cards);
		play(cards);
		sc.close();
	}

	public static void proverka(String[] cards) {
		for (int i = 0; i < cards.length; i++) {
			String card2 = "10";
			if (cards[i].length() == 1 || cards[i].equals(card2)) {

				switch (cards[i]) {
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
				case "10":
				case "J":
				case "j":
				case "Q":
				case "q":
				case "K":
				case "k":
				case "A":
				case "a": {
					System.out.println("Kartata e validna");
					break;
				}
				}
			} else {
				System.out.print("Kartata ne e validva");
				break;
			}
		}
	}

	public static void play(String[] cards) {
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();

		for (String karti : cards) {
			Integer count = wordsCount.get(karti);
			if (count == null) {
				count = 1;
			}
			wordsCount.put(karti, count + 1);

			if (count == 4) {
				System.out.println(wordsCount + " Igrachut ima kare");
				break;
			} else if (count == 3) {
				System.out.println(wordsCount + " Igrachut ima set");
				break;
			} else if (count == 2) {
				System.out.println(wordsCount + " Igrachut ima chift");
			}
		}
	}
}
