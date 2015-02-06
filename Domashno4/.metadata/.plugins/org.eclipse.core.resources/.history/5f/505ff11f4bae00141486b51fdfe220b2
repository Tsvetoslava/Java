/*Дефинирайте абсрактен клас Stock който 
съдържа информация за артикул в магазин
цена и boolean поле дали е наличн.
Реализирайте класове за месо, зеленчуци,
плодове, напитки и десерти с поне по 2 уникални
полета, който характеризират артикула
 */
public class Dessert extends Stock {
	private String ime;
	private boolean isChocolate;

	public Dessert() {
		super();
		this.ime = "";
		this.isChocolate = false;
	}

	public Dessert(String ime, boolean isChocolate, double price,
			boolean isAvailable) {
		super(price, isAvailable);
		this.ime = ime;
		setChocolate(isChocolate);
		setIme(ime);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public boolean isChocolate() {
		return isChocolate;
	}

	public void setChocolate(boolean isChocolate) {
		this.isChocolate = isChocolate;
	}

	@Override
	public String toString() {
		return "Dessert [getIme()=" + getIme() + ", isChocolate()="
				+ isChocolate() + "]";
	}
}
