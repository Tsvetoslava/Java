import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		

Random rand = new Random();
		
		int count = 1000000;
		
		int numbers[] = new int[count];
		int[] selectionSortedArr = selectionSort(numbers);

		for (int i = 0; i < count; i++) {
			numbers[i] = rand.nextInt();
		}
		
		MergeSort sorter = new MergeSort();
		
		System.out.println("���������� �� �����������: ");
		
		long startTime = System.currentTimeMillis();
		
		sorter.sort(numbers);
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		float seconds = (float) totalTime / 1000;
		
		System.out.println("����� �� ���������� s MergeSort" + seconds);

		long startTime2 = System.currentTimeMillis();
		selectionSort(numbers);
		long endTime2 = System.currentTimeMillis();

      long totalTime2 = endTime2 - startTime2;
		
		float seconds2 = (float) totalTime2 / 1000;
		
		System.out.println("����� �� ���������� s SelectionSort" + seconds2);
		
		
	
	
	}

	private static int[] selectionSort(int numbers[]) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[index]) {
					index = j;
				}
			}

			int smallest = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = smallest;
		}
		return numbers;

	}
}
