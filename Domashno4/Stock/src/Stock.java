/*Дефинирайте абсрактен клас Stock който 
съдържа информация за артикул в магазин
цена и boolean поле дали е наличн.
Реализирайте класове за месо, зеленчуци,
плодове, напитки и десерти с поне по 2 уникални
полета, който характеризират артикула
 */

public abstract class Stock {
	private double price;
	private boolean isAvailable;

	public Stock() {
		this.isAvailable = false;
		this.price = 0;
	}

	public Stock(double price, boolean isAvailable) {
		this();
		setPrice(price);
		setIsAvailable(isAvailable);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public abstract String toString();

}