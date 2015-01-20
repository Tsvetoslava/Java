import java.util.Scanner;


public class Name {
	public static void main(String[] args) {

		
	
Scanner sc=new Scanner(System.in);
System.out.println("Vuvedi izrechenie: ");
       String sentence=sc.nextLine();


		String[] names=new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Vuvedi "+(i+1)+" ime:");
			names[i]=sc.next();
		}
		
		for (String string : names) {
			if (sentence.endsWith(string)) {
				System.out.println("Изречението завършва с  "+string);
			} else if (sentence.startsWith(string)) {
				System.out.println("Изречението започва с "+string);
			} else if (sentence.contains(string)) {
				System.out.println("Изречението съдържа  "+string);
			}
		}

		
		
		
	
	}
}
