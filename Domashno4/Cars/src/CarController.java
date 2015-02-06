/*Дефинирайте клас Car с единствено поле цена.
Създайте клас Automobile който наследява Car и 
съдържа допълнително поле за разход на гориво. 
Създайте клас SUV който налседява Car  и съдържа
boolean поле дали джипа е високопроходим. 
5 коли и 5 джипа. Сортирайте масива по цена на конкретната кола. 
 */

public class CarController {

	public static void main(String[] args) {
		Car[] array = new Car[10];
		array[0] = new SUV(true, 7000);
		array[1] = new SUV(false, 5432);
		array[2] = new SUV(true, 54332);
		array[3] = new SUV(false, 63452);
		array[4] = new SUV(true, 53253);
		array[5] = new Automobile(57646, 5);
		array[6] = new Automobile(667457, 7);
		array[7] = new Automobile(76757, 6);
		array[8] = new Automobile(4765, 6);
		array[9] = new Automobile(8657, 9);

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].price > array[j].price) {
					double swap = array[i].price;
					array[i].price = array[j].price;
					array[j].price = swap;
				}
			}
		}

		for (int sort = 0; sort < array.length; sort++) {
			System.out.println("Sorted by price: " + array[sort].price);
		}
	}
}
