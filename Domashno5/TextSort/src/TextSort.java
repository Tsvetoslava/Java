import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TextSort {
	
		public static void main(String[] args) {
			
			
			
			   Scanner sc = new Scanner(System.in);
		       System.out.println("Enter text: ");
		       String text = sc.nextLine();
		       String[] words = text.split("\\W+");
		      
		       System.out.println(words.length);
				
		       Arrays.sort(words);
			
			HashSet<String> dumi= new HashSet<String>();
			 Arrays.sort(words);
			dumi.addAll(Arrays.asList(words)); 
			
			for(String word:dumi){
				System.out.println(word);
			}
			

		}


}