//Направете програма която приема изречение и брои колко думи има в него
import java.util.Scanner;

public class Sentence {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi izrechenie:");
		String sentence = sc.nextLine();

		int count = 0;
		if (sentence.charAt(0) != ' ') {
			count++;
		}
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) == ' ')) {
				count++;
			}
		}
		System.out.println("Dumite v izrechenieto sa: " + count);
		sc.close();
	}
}
