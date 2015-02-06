/*Направете програма, която приема две числа с плаваща запетая 
 съответно дължината и ширината на правоъгълник. Пресметнете
  лицето на дадния правоъгълник и я изведете на конзолата
 */
import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa za namirane na lice na pravougulnik");
		System.out.println("Vuvedi duljina:");
		float duljina = sc.nextFloat();
		System.out.println("Vuvedete shirina:");
		float shirina = sc.nextFloat();

		float result = duljina * shirina;
		if (result > 0) {
			System.out.println("Liceto na pravougulnika e: " + result);
		} else {
			System.out.println("Error");
		}
		sc.close();
	}
}
