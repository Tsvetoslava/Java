import java.util.Scanner;


public class Math {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String number1="5.7";
	String number2=null;
	
	try{
	double n1=Double.parseDouble(number1);
	double n2=Double.parseDouble(number2);
	double rezult=n1/n2;
	System.out.println("Rezultat: "+n1+"/"+n2+"= "+rezult);
	
	}
	catch (NullPointerException e2){
	System.out.println("Nulev string");
    }
	catch(NumberFormatException e1){
		System.out.println("Greshka pri parsvaneto");
	}
 
	catch (Exception e3) {
		System.out.println("Izkluchenie" + e3.getMessage());
	}
	
}	
}

