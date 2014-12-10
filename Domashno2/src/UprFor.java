import java.util.Scanner;


public class UprFor {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("vuvedi 1 chislo");
		int b=sc.nextInt();
		System.out.println("vuvedi 2 chislo");
		int c=sc.nextInt();
		
		
		
		
		for (int i = 1; i <= 100; i++) {
			if(i%b==0 ||i%c==0){
				System.out.println(i);
			}
			
			
		}
		
		
		
	}
	
}
