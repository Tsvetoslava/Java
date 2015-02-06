/*Ќаправете програма ко€то приема 5 числа от конзолата и
 *ги сортира по големина. —лед сортирането изведете масива на екрана
 */

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrBubble = new int[5];

		for (int i = 0; i < arrBubble.length; i++) {
			System.out.println("Vuvedi chislo");
			arrBubble[i] = sc.nextInt();
		}
		bSort(arrBubble);
	}

	public static void bSort(int[] arrBubble) {

		boolean swap = true;
		int j = 0;
		int tmp;
		while (swap) {
			swap = false;
			j++;
			for (int i = 0; i < arrBubble.length - j; i++) {
				if (arrBubble[i] > arrBubble[i + 1]) {
					tmp = arrBubble[i];
					arrBubble[i] = arrBubble[i + 1];
					arrBubble[i + 1] = tmp;
					swap = true;
				}
			}
		}
		for (int i : arrBubble) {
			System.out.println(i);
		}
	}
}
