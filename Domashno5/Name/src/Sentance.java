import java.util.Scanner;


public class Sentance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentance=sc.nextLine();
		
		String[] parts = sentance.split(" |,|!|?");
		
		
		
		
		
		
		for (int i =parts.length-1; i>=0; i--) {
		System.out.println(parts[i]);
		}
		
		
	}
	
	
	
}
