import java.util.Scanner;


public class Zadacha1 {
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Programa za namirane na lice na pravougulnik");
		System.out.println("Vuvedi duljina:");
		float f1=sc.nextFloat();
		
		System.out.println("Vuvedete shirina:");
		float f2=sc.nextFloat();
		
		
		float result=f1*f2;
		if(result>0){
		System.out.println("Liceto na pravougulnika e: "+result);
		}
		else{
			System.out.println("Error");
		}
			
		
		}
}
