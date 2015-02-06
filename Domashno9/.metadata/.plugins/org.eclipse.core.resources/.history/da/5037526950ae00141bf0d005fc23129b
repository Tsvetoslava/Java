/*Ќаправете програма, ко€то приема 20 числа 
 и намира тройката поредни числа с най-гол€ма сума
 */
public class Redica {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 567, 34, 56, 43, 56, 34, 56, 23, 67, 78, 67,
				45, 34, 79, 576, 45 };

		int maxSum = Integer.MIN_VALUE;
		int maxSumStartIndex = -1;

		for (int i = 2; i < numbers.length; i++) {

			int currentSum = numbers[i] + numbers[i - 1] + numbers[i - 2];

			if (currentSum > maxSum) {
				maxSum = currentSum;
				maxSumStartIndex = i - 2;

			}

		}

		System.out.println(numbers[maxSumStartIndex]);
		System.out.println(numbers[maxSumStartIndex + 1]);
		System.out.println(numbers[maxSumStartIndex + 2]);
	}
}
