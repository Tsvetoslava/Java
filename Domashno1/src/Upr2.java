import java.util.Scanner;


public class Upr2 {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedete chislata");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		System.out.println("Nai-golqmo");
		if(a>b && a>c){
			System.out.println(a);
		}
		else if(b>a&&b>c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		
		System.out.println("nai-malko");
		if(a<b && a<c){
			System.out.println(a);
		}
		else if(b<a&&b<c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
	}
	}
}
