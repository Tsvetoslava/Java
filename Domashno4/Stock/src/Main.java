/*Дефинирайте абсрактен клас Stock който 
съдържа информация за артикул в магазин
цена и boolean поле дали е наличн.
Реализирайте класове за месо, зеленчуци,
плодове, напитки и десерти с поне по 2 уникални
полета, който характеризират артикула
 */
public class Main {

	public static void main(String[] args) {
		Stock[] stock = new Stock[1000];
		stock[0] = new Dessert("Cake", true, 20, true);
		stock[1] = new Meat(false, 0, "svinsko", "20.09.2015");
		stock[2] = new Fruit(87, false, true, "orange");
		stock[3] = new Drink(3, true, false, "Coca-cola");
		stock[4] = new Vegetable(false, "tomato", 23, false);

		stock[0].toString();
		stock[1].toString();
		stock[2].toString();
		stock[3].toString();
		stock[4].toString();
	}
}
