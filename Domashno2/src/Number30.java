
public class Number30 {

	public static void main(String[] args) {
		
	       
        int counter=30;

for (int rows =5 ; rows >=1 ; rows--) {
	for (int columns = 6; columns >=1; columns--) {
		if(counter<=9){
		System.out.print(counter+"  ");
		}else{
			System.out.print(counter+" ");
		}
		counter--;
	}
	System.out.println();
}
}
	
	
}
