import java.util.Scanner;


public class UprDoWhile {
	
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("vuvedi 1 chislo");
		int number1=sc.nextInt();
		System.out.println("vuvedi 2 chislo");
		int number2=sc.nextInt();
	    int counter=1;
		do{
			if(counter%number1==0 || counter%number2==0  ){
				System.out.println(counter);
			}
			counter++; 
			
		}while(counter<=100);
		
}
}
