//Направете програма с функция която принтира всички симетрични числа в интервала [0 ; 999]
package Domashno3;

public class SimetrichniChisla2 {

	public static void main(String[] args) {
		print();
	}

	public static void print() {
		for (int number = 0; number < 1000; number++) {
			if (number < 10) {
				System.out.print(number + " ");
			} else if ((number >= 11 && number < 100 && number % 10 == number / 10)) {
				System.out.print(number + " ");
			} else if (number > 100 && number % 10 == number / 100) {
				System.out.print(number + " ");
			}
		}
	}
}
