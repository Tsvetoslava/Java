/*Направете програма, която приема 10 числа и
извежда на екрана най-дългата нарасваща поредица от тях. 
 */
import java.util.Scanner;

public class Redica1 {
	public static void main(String[] args) {
		int[] array = new int[10];

		vuvejdane(array);
		print(array);
	}

	public static void vuvejdane(int[] array) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Vuvedi " + counter + " chislo: ");
			int number = sc.nextInt();
			array[i] = (number);
			counter++;
		}
		sc.close();
	}

	public static void print(int[] array) {
		int[] arr = new int[array.length];
		int counter = 1;
		int counter2 = 1;
		int i = 0;
		int num = array[0];
		int k = 0;
		boolean Flag = true;

		while (Flag) {
			if (num < array[i + 1]) {
				k = i + 1;
				counter++;
				num = array[i + 1];

			} else if (array[i] >= array[i + 1]) {
				num = array[i + 1];
				if (counter > counter2) {
					for (int j = 0; j < counter; j++) {
						arr[j] = array[k - (counter - 1)];
						k++;
					}
					counter2 = counter;
				}
				counter = 1;
			}
			i++;
			if (i == array.length - 1) {
				Flag = false;
			}
		}

		for (int z = 0; z < counter2; z++) {
			System.out.print(arr[z] + "  ");
		}
	}
}