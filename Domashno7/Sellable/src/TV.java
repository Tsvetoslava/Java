/*Направете класове за Телевизор, Мобилен телефон и Лаптоп,
които имплементират интерфейса Sellable
 */
public class TV implements Sellable {
	protected String name;
	protected int money;

	public TV() {

	}

	public TV(String name, int money) {
        setName(name);
		setMoney(money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void sell() {
		System.out.println(getMoney());
	}
}
