import java.util.Scanner;


public class Zadacha5 {
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Vuvedi chislo ot [1-9]");
		int a=sc.nextInt();
		
		if(a<1||a>9){
			System.out.println("Error"); 
		}
		
		
		
		if(a>0 && a<4){
			a=a*5;
			System.out.println("Rezultat: "+a);
		}
		else if(a>3 && a<7){
			a=a*10;
			System.out.println("Rezultat: "+a);
		}
		else if(a>6 && a<10){
			a=a*50;
			System.out.println("Rezultat: "+a);
		}
		
	
	}
}
