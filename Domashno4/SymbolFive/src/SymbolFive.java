import java.util.Scanner;


public class SymbolFive {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	System.out.println("Vuvedi 5 simvolna duma: ");
	String word=sc.nextLine();
	if(word.length()>6){
		System.out.println("nevalidna duma");
	}
	char[] arr = word.toCharArray(); 
	char [] array= new char[5];
	
	System.out.println("Vuvedi 5 simvola: ");
	for(int j=0;j<array.length;j++){
		array[j]=sc.next().charAt(0);
		}
	
	

	for (char c : arr) {
		System.out.print(c);
	}
	
	System.out.println();
	
	for (char c : array) {
		System.out.print(c);
	}
	
	print(arr, array);
	}
	
	public static void print(char[]arr,char[]array){
		for (int i = 0; i < array.length; i++) {
			
		
		if(array[0] == arr[i] || array[1] == arr[i] 
				|| array[2] == arr[i] || array[3] == arr[i] || array[4] == arr[i]){
			System.out.print(" sumvolut suvpada");
		}
		
		else{
			System.err.println("     ne moje da se obrazuvana duma");
			break;
		}
		}
	}
	
}
	
	


	

	