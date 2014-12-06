import java.util.Scanner;


public class Zadacha6 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("vuvedi karta");
		char c=sc.next().charAt(0);
		
		
		
		switch(c){
		
		case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': 
	    case 'J': case 'K': case 'Q': case 'A': case 'T':
			
		{
			System.out.println("Validna karta"); break;
		}
		
		
		default : {
			System.out.println("Nevalidna karta"); break;
		}
		
		}
		
		
	
	}
}
