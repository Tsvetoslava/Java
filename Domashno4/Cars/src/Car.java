/*Дефинирайте клас Car с единствено поле цена.
Създайте клас Automobile който наследява Car и 
съдържа допълнително поле за разход на гориво. 
Създайте клас SUV който налседява Car  и съдържа
boolean поле дали джипа е високопроходим. 
5 коли и 5 джипа. Сортирайте масива по цена на конкретната кола. 
 */
public class Car {
	protected double price;

	public Car() {
		this.price = 0;
	}

	public Car(double price) {
		this();
		this.price = price;
	}

	public static double[] sort(double... price) {
		for (int i = 0; i < price.length - 1; i++) {

			for (int j = i + 1; j < price.length; j++) {
				// Swapping the values
				if (price[i] > price[j]) {
					double tempVar = price[i];
					price[i] = price[j];
					price[j] = tempVar;
				}
			}
		}
		return price;
	}
}
