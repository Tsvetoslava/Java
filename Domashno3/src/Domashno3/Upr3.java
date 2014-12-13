package Domashno3;

import java.util.Scanner;

public class Upr3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Vuvedi chislo v intervala [10-30 000]:");
	int number=sc.nextInt();
	if(number>=10 && number<=30000){
		rekursiq(number);
		System.out.println(rekursiq(number));
	}
	else{
		System.out.println("Chisloto ne e v intervala");
	}
	
	
	
}


public static int rekursiq(int number){
	
	if(number==0 )
		return 0;
	else 
		{
		return number+rekursiq(number-1);
		}
}
}
