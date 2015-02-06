/*  Компания се нуждае от система за съхранение на информация за служители. 
 *  Направете програма, която изисква следната информация: Име, Фамилия,
 *  Години (0, 120), пол (еднобуквен 'м' или 'ж'), ЕГН, телефон. Подберете
 *  подходящите типове данни и декларирайте нужните променливи. Прочетете
 *   от конзолата нужната иформация за служител и след това я изведете на конзолата
 */

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		System.out.println("Informaciq za slujitel");
		Scanner sc = new Scanner(System.in);

		System.out.println("Vuvedi ime");
		String ime = sc.nextLine();
		System.out.println("Vuvedi familiq");
		String familia = sc.nextLine();
		System.out.println("Vuvedi godini");
		byte godini = sc.nextByte();
		System.out.println("POL:");
		char p = sc.next().charAt(0);
		System.out.println("Vuvedi EGN:");
		String egn = sc.next();
		System.out.println("Vuvedi tel. nomer:");
		String tel = sc.next();

		System.out.println("Ime: " + ime);
		System.out.println("Familia :" + familia);
		if (godini < 0 || godini > 120) {
			System.out.println("Error");
		} else {
			System.out.println("Godini: " + godini);
		}

		if (p != 'Ж' && p != 'ж' && p != 'м' && p != 'М') {
			System.out.println("error");
		} else {
			System.out.println("ПОЛ: " + p);
		}

		System.out.println("EGN: " + egn);
		System.out.println("Telefonen nomer: " + tel);

		sc.close();
	}
}
