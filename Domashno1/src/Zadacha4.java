/*ефинирайте две int променливи със стойности съответно 1 и 3.
 *  Опитайте се да размените техните стойности.
 */

public class Zadacha4 {

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 3;

		int c = number1;
		number1 = number2;
		number2 = c;

		System.out.println("number2 " + number1);
		System.out.println("number1 " + number2);
	}
}
