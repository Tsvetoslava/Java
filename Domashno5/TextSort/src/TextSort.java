import java.util.Arrays;
import java.util.Scanner;


public class TextSort {
	
		public static void main(String[] args) {
			
			
			
			   Scanner sc = new Scanner(System.in);
		       System.out.println("Enter text: ");
		       String text = sc.nextLine();
		       String[] words = text.split("\\W+");
		      
		       System.out.println(words.length);
			
			
			
			
			Arrays.sort(words);
		for (String string : words) {
			System.out.print(string+" ");
		}
		}
		}


