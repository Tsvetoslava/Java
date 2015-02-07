/*Направете програма която приема масив от 20 числа
 и едно число K. Намерете дали в масива има поредица, чията сума е K:
{4, 3, 1, 4, 2, 5, 8}, K=11  {4, 2, 5}	
 */

import java.util.Scanner;

public class ArrayK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vuvedi 20 chisla v masiv: ");
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Vuvedi chislo k, za da "
				+ " dali ima redica, koqto suma e ravna na K");
		int k = scan.nextInt();
		scan.close();

		ArrayK sumOfK = new ArrayK();
		sumOfK.findTheSumOfK(array, k);
	}

	public void findTheSumOfK(int[] array, int numK) {
		int sum = 0;
		int start = 0;
		for (int i = 0; i <= array.length; i++) {

			while (sum > numK) {
				sum = sum - array[start++];
			}
			if (sum == numK) {
				System.out.println(numK + " ima suvpadenie mejdu " + start
						+ " i " + (i - 1));
				System.out.print("Elementite sa: ");
				for (int j = start; j <= i - 1; j++) {
					System.out.print(" " + array[j]);
				}
				return;
			}
			if (i < array.length) {
				sum = sum + array[i];
			}
		}
		System.out.println("No subarray is found with sum equals to " + numK);
	}
}
