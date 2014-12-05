import java.util.Scanner;


public class Upr1 {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("vuvedi 1 chislo");
		int a=sc.nextInt();
		System.out.println("vuvedi 2 chislo");
		int b=sc.nextInt();
		System.out.println("vuvedi string");
		String str=sc.next();
		
		//1
		boolean b1=str.length()>10;
		System.out.println("Дали размера на string е по-голям от 10");
		System.out.println(b1);
		System.out.println();
		
		
		
	///2
		
		boolean b2 = a > b;
		System.out.println(" a > b");
		System.out.println(b2);
		System.out.println();
		
		//3
		
		boolean b3=(b>=-100 && b<15);
		System.out.println("Дали второто число е в интервала [-100; 15)");
				System.out.println(b3);
				System.out.println();
			//4	
				int b4=a%b;
		System.out.println("Остатъкът от деленето на първото число с второто");
		System.out.println(b4);
		System.out.println();
		
		//5
		
		boolean b5=(a>10);
		boolean b6=(b<88);
		System.out.println("Резултатът от логическата операция –"
				+ " Дали първото число е по-голямо от 10 или второто"
				+ " число е по-малко от 88");
		System.out.println(b5|| b6);
		
		
	}
	
}
