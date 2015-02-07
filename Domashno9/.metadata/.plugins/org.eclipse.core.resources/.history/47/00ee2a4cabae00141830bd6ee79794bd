/*Направете програма която приема масив от 20 числа
 и едно число K. Намерете дали в масива има поредица, чията сума е K:
{4, 3, 1, 4, 2, 5, 8}, K=11  {4, 2, 5}	
 */

import java.util.Scanner;

public class ArrayK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 4, 3, 1, 4, 2, 5, 8 };
		int k = sc.nextInt();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == sum) {
				System.out.println("Number and index: " + arr[i] + " " + i);
			} else if (sum > sum) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				sum += arr[j];
				if (sum == sum) {
					System.out.println("First number, index and length: "
							+ arr[i] + " " + i + " " + (j - i + 1));
				} else if (sum > sum) {
					sum = 0;
					break;
				}
			}
		}

	}
}
