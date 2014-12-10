
public class Cards {
public static void main(String[] args) {
		
		int counter=1;
		char [] cards=new char[13];
		cards[9]='J';
		cards[10]='Q';
		cards[11]='K';
		cards[12]='A';
		
		for (int i = 1; i <=14; i++) {
			for (int j = 1; j <=4; j++) {
				if(counter==11){
					System.out.print(cards[9]);
				}
				else if(counter==12){
					System.out.print(cards[10]);
				}
				else if(counter==13){
					System.out.print(cards[11]);
				}
				else if(counter==14){
					System.out.print(cards[12]);
				}else{
				System.out.print(counter);
				}
			}
			System.out.println();
			counter++;
		}
		
		
		
	}

}
