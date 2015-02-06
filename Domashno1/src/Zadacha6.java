/*Класическото тесте карти се състои от 13 различни вида карти съответно
 *  2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Направете програма която
 *  приема от конзолата 1 символ и принтира "Валидна карта" ако символът
 *  представлява валидна карта и съответно "Невалидна карта" ако символът
 *  не представлява валидна карта.
 */

import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a card : ");
		String card = sc.nextLine();
		String card2 = "10";
		cardValid(card, card2);
		sc.close();
	}

	public static void cardValid(String card, String card2) {
		if (card.length() == 1 || card.equals(card2)) {
			switch (card) {
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
				System.out.println("Card is valid!");
				break;
			}
			}
		} else {
			System.out.println("Invalid card!");

		}

	}
}
