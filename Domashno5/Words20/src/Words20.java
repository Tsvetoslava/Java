/*Направете програма, която приема 20 думи и 
 показва по колко пъти се среща всяка една от тях
 */
import java.util.HashMap;
import java.util.Scanner;

public class Words20 {

	public static void main(String[] args) {
		String[] words = new String[20];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.println("Vuvedi " + (i + 1) + " duma ");
			words[i] = sc.nextLine();
		}
		sc.close();
		HashMap<String, Integer> wordsHM = new HashMap<String, Integer>();

		for (String dumi : words) {
			Integer broqch = wordsHM.get(dumi);
			if (broqch == null) {
				broqch = 0;
			}
			wordsHM.put(dumi, broqch + 1);
		}
		System.out.println(wordsHM);
	}
}
