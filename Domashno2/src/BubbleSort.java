import java.util.Scanner;


public class BubbleSort {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr = new int[5];
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Vuvedi chislo");
			arr[i] = sc.nextInt();
	
		}
		
		
		
		      boolean swap = true;
		      int j = 0;
		      int tmp;
		      while (swap) {
		            swap = false;
		            j++;
		            for (int i = 0; i < arr.length - j; i++) {                                       
		                  if (arr[i] > arr[i + 1]) {                          
		                        tmp = arr[i];
		                        arr[i] = arr[i + 1];
		                        arr[i + 1] = tmp;
		                        swap = true;
		                  }
		            }                
		      }
		      for (int i : arr) {
				System.out.println(i);
			}
		}
}
