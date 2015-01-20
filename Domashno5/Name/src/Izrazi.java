
public class Izrazi {

	public static void main(String[] args) {
String izraz = "4 * )(5 - 2) + 6/(2 * (2 + 15))";

		
char[] arr = izraz.toCharArray();
	int count=0;
	for (char c : arr) {
		if(c=='('){
			count++;
			
		}
		
		else if(c==')'){
			count--;	
			if(count<0){
				System.out.println("Nevaliden izraz");
				break;
			}
			
		}
		
		
	}
	System.out.println(count);
		}
		
	}

