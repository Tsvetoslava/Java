/*Дефинирайте клас Car с единствено поле цена.
Създайте клас Automobile който наследява Car и 
съдържа допълнително поле за разход на гориво. 
Създайте клас SUV който налседява Car  и съдържа
boolean поле дали джипа е високопроходим. 
5 коли и 5 джипа. Сортирайте масива по цена на конкретната кола. 
 */

public class Automobile extends Car {
	double expense;

	public Automobile() {
		super();
		this.expense = 0;
	}

	public Automobile(double price, double expense) {
		super(price);
		this.expense = expense;
	}

	@Override
	public String toString() {
		return "Automobile [expense=" + this.expense + ", price=" + super.price
				+ "]";
	}
}
