import java.util.Scanner;


public class Zadacha1 {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
		
	
	int number1;
	int number2;
	
		System.out.println("Vuvedi purvo chislo :");
		 number1=sc.nextInt();
		System.out.println("Vuvedi vtoro chislo :");
		 number2=sc.nextInt();
		
		
		System.out.println("Chislata mejdu dvete cifri,koito se delqt na 3 sa: ");
		for(int counter=number1;counter<=number2;counter++){
			if(counter%3==0){
			System.out.println(counter);
			}
		}
		
	}	
		
		
	

		
		
	}

