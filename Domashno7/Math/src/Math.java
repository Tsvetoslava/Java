/* Направете програма, която приема 2 дробни числа и дели първото на второто. 
Използвайте try…catch… блок с всички възможни типове изключения
 */
import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number1 = sc.nextLine();
		String number2 = sc.nextLine();

		try {
			double n1 = Double.parseDouble(number1);
			double n2 = Double.parseDouble(number2);
			double rezult = n1 / n2;
			System.out.println("Rezultat: " + n1 + "/" + n2 + "= " + rezult);

		} catch (NullPointerException e2) {
			System.out.println("Nulev string");
		} catch (NumberFormatException e1) {
			System.out.println("Greshka pri parsvaneto");
		}

		catch (Exception e3) {
			System.out.println("Izkluchenie" + e3.getMessage());
		}
		sc.close();
	}
}
