package Domashno3;



public class Upr1 {
public static void main(String[] args) {
	

	String [][] menu=new String [][]{
		
			new String[] {"Sypu: ","s1","s2","s3"},
			new String[] {"Osnovni: ","o1","o2","o3","o4"," o5"," o6"},
			new String[] {"Desetri: ","d1","d2"},
			
			
	};
	System.out.println("    Menu");
	System.out.println("   ******");
	
	for(int i = 0; i < menu.length; i++) {
		for (int j = 0; j < menu[i].length; j++) {
			
					System.out.printf( menu[i][j]);
					if(j!=0 && j!=menu[i].length-1){
						System.out.print(",");
					}
				}
				System.out.println();
			}
			
			
			
	}
	
	
	
	
}

