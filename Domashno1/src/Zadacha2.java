import java.util.Scanner;


public class Zadacha2 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Vuvedi purvo chislo");
		int a=sc.nextInt();
		System.out.println("Vuvedi vtoro chislo");
		int b=sc.nextInt();
		System.out.println("Vuvedi treto chislo");
		int c=sc.nextInt();
		
		
		if((a>b&&a>c) || (b>c &&b >a) || (c>a && c>b)){
			System.out.println("Ne moje da bude obrazuvam takuv triugulnik");
		}
		else{
			System.out.println("Moje da bude obrazuvan takuv triugulnik");
		}
		
		
	}
}
