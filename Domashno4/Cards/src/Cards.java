/*Направете програма която приема число от 1 до 52
и изкарва на екрана на коя карта от тестето карти отговаря числото
 */
import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi karta: ");
		int card = sc.nextInt();

		if (card > 0 && card < 14) {
			System.out.println("spatiq");
		} else if (card >= 14 && card < 27) {
			System.out.println("karo");
		} else if (card >= 27 && card < 40) {
			System.out.println("kupa");
		} else if (card >= 40 && card < 53) {
			System.out.println("pika");
		} else
			System.out.println("nevalidna karta");

		String[] karti = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "J", "Q", "K", "A" };

		int counter = 1;
		for (int i = 0; i <= karti.length - 1; i++) {
			if (counter == card) {
				System.out.printf("Kartata e :%s", karti[i]);
				break;
			} else {
				counter++;
			}
		}
		sc.close();
	}
}
