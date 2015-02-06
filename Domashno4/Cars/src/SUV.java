/*Дефинирайте клас Car с единствено поле цена.
Създайте клас Automobile който наследява Car и 
съдържа допълнително поле за разход на гориво. 
Създайте клас SUV който налседява Car  и съдържа
boolean поле дали джипа е високопроходим. 
5 коли и 5 джипа. Сортирайте масива по цена на конкретната кола. 
 */

public class SUV extends Car {
	boolean isHigh;

	public SUV() {
		super();
		this.isHigh = false;
	}

	public SUV(boolean isHigh, double price) {
		super(price);
		this.isHigh = isHigh;
	}

	@Override
	public String toString() {
		return "SUV [isHigh=" + this.isHigh + ", price=" + super.price + "]";
	}
}
