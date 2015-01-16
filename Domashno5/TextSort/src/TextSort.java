import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		  ArrayList<String> arrayL = new ArrayList<String>(Arrays.asList(words));
		  
		  Collections.sort(arrayL);
			
	

	    	HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
			
	    	for(String string : arrayL)
			{
				if(wordsCount.get(string)==null)
				{
					wordsCount.put(string, 1);
				}
				
				else
				{	
					Integer count = wordsCount.get(string);
					wordsCount.put(string, count+1);	
		 		}
				
			}
			
			
			
	    	Set<String> wordKeys = wordsCount.keySet();
			for (String word : wordKeys) 
	{
		int count = wordsCount.get(word);
		if(count>=1)
		{
		System.out.printf("%s \n",  word);
		}

	}

		}
}