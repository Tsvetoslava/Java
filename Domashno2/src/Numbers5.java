import java.util.Scanner;


public class Numbers5 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int large;
		int[] arr = new int[5];
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Vuvedi chislo");
			arr[i] = sc.nextInt();
	
		}
		
		
		 large=arr[0];
        
        for (int i=0; i<arr.length; i++) {
             
              if (large<arr[i]) 
            	  {
            	  large=arr[i];
            	  }
             
        }
        
        
        System.out.println("Nai-golqmoto chislo e:"+large);
	
	
}
}
