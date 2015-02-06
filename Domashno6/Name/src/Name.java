
/*Направете програма която приема 5 имена. След като потребителят въведе
 имената програмата изисква едно изречение. 
 Проверете дали:
 Изречението започва с някое от имената
 Изречението завършва с някое от имената
 Изречението съдържа някое от имената
 Изведете резултатите на екрана.
 * Ако изречението започва или завършва с някое от имената,
 не трябва да изкарвате съшто име като съдържащо се вътре в изречението
 */

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi izrechenie: ");
		String sentence = sc.nextLine();
		String[] names = new String[5];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Vuvedi " + (i + 1) + " ime:");
			names[i] = sc.next();
		}

		for (String ime : names) {
			if (sentence.endsWith(ime)) {
				System.out.println("Изречението завършва с  " + ime);
			} else if (sentence.startsWith(ime)) {
				System.out.println("Изречението започва с " + ime);
			} else if (sentence.contains(ime)) {
				System.out.println("Изречението съдържа  " + ime);
			}
		}
	}
}
