import java.util.Scanner;


public class CelsiusController {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Vuvedi stoinost ");
	int stoinost=sc.nextInt();
	Celsius c1=new Celsius(stoinost);
	Celsius c2=new Celsius(9);
	
	
	c1.printFahrenheit();
	c2.printFahrenheit();
}
}
