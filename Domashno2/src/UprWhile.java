/*Направете програма, която извежда на конзолата всички числа от 1 до 100 които се делят
или на 7 или на 11 без остатък.
Решете задачата по 3 различни начина съответно с трите цикли от лекцията
 */
import java.util.Scanner;

public class UprWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vuvedi 1 chislo");
		int number1 = sc.nextInt();
		System.out.println("vuvedi 2 chislo");
		int number2 = sc.nextInt();
		int counter = 1;

		while (counter <= 100) {
			if (counter % number1 == 0 || counter % number2 == 0) {
				System.out.println(counter);
			}
			counter++;
		}
	}
}
