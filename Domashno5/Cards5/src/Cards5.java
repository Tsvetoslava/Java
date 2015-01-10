import java.util.Scanner;


public class Cards5 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String[] cards=new String[5];
	
	for (int i = 0; i < cards.length; i++) {
		System.out.println("Vuvedi "+(i+1)+ " karta");
		cards[i]=sc.nextLine();
			
	}
	for (String string : cards) {
		System.out.println(string);
	}
	
	
}
}
