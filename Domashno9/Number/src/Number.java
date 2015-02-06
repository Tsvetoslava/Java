//Направете програма, която приема едно число и обръща неговите цифри в обратен ред

public class Number {
	public static void main(String[] args) {

		try {
			String number = "1234567";
			int pars = Integer.parseInt(number);
			char[] numberChar = number.toCharArray();

			for (int i = numberChar.length - 1; i >= 0; i--) {
				System.out.print(numberChar[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Error " + e.getMessage());
		}

	}
}
