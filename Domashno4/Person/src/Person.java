/*Дефинирайте клас Person който да има име, години и e-mail.
Капсулирайте полетата на класа. За валидни данни приемете :
Име - повече от 3 символа
Години – положително число по-малко от 200
е - mail – повече от 3 символа
Дефинирайте функция която извежда в конзолата данните на човека.
Направете 3 обекта от тип Person и демонстрирайте функциите на класа.
 */

public class Person {
	private String name;
	private int age;
	private String email;

	public Person() {
		this.name = "";
		this.age = 0;
		this.email = "";
	}

	public Person(String name, int age, String email) {
		this();
		setName(name);
		setAge(age);
		setEmail(email);
	}

	@Override
	public String toString() {
		return "Person:  name-" + getName() + " age-" + getAge() + " email-"
				+ getEmail();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 3) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age < 201) {
			this.age = age;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() >= 3) {
			this.email = email;
		}
	}
}
