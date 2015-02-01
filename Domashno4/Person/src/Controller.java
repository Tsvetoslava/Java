/*Дефинирайте клас Person който да има име, години и e-mail.
Капсулирайте полетата на класа. За валидни данни приемете :
Име - повече от 3 символа
Години – положително число по-малко от 200
е - mail – повече от 3 символа
Дефинирайте функция която извежда в конзолата данните на човека.
Направете 3 обекта от тип Person и демонстрирайте функциите на класа.
 */

public class Controller {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan", -12, "ivan@abv.bg");
		Person p2 = new Person("Maria", 32, "mimi@abv.bg");
		Person p3 = new Person("Stoqn", 40, "stoqn@abv.bg");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
