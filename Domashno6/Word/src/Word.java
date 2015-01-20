import java.util.Scanner;


public class Word {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedi duma ");
		String word=sc.nextLine();
		
	
		  char[] arr = word.toCharArray(); 
		
		
		for (int i =arr.length-1; i>=0; i--) {
		System.out.print(arr[i]);
		}
		
		
	}
}
