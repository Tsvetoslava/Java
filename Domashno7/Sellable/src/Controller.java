import java.util.ArrayList;
import java.math.BigDecimal;

public class Controller {

	public static void main(String[] args) {
		ArrayList<Sellable> sell = new ArrayList<Sellable>();

		TV tv1 = new TV("Sony", 1000);
		GSM gsm1 = new GSM("Samsung", 500);
		Laptop laptop1 = new Laptop("Toshiba", 1500);

		sell.add(tv1);
		sell.add(gsm1);
		sell.add(laptop1);

		ShoppingCart checkout = new ShoppingCart(new BigDecimal(15000), sell);

		try {
			BigDecimal money1 = new BigDecimal(1000);
			checkout.sell(money1);
			System.out.println("Uspeshna tranzakciq");

			BigDecimal money2 = new BigDecimal(500);
			checkout.sell(money2);
			System.out.println("Uspeshna tranzakciq");

		} catch (NewException e) {
			System.out.println("Neuspeshna tranzakciq");
		}
	}
}
