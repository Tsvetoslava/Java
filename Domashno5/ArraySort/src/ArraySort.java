import java.util.Arrays;
import java.util.Scanner;


public class ArraySort {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Vuvedi kolko chisla da budat v masiva: ");
	int n=sc.nextInt();
	int[]array=new int[n];
	
	for (int i = 0; i < n; i++) {
		System.out.println("Vuvedi "+(i+1) +" chislo: ");
		array[i]=sc.nextInt();
	}
	
	
	Arrays.sort(array);
	
	
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
	}
}
}