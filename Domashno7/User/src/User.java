/*Направете клас за потребител съдържащ полета за e-mail и парола.
Направете валидация за двете полета, като при намиране на
 невалидни данни създавайте изключения:
Валиден e-mail: над 5 символа, съдържа @ и .
Валидна парола: съдържа минимум 6 символа и поне една цифра
Създайте програма, която приема данни за 3 потребителя и 
обработва коректно възможните изключения
 */

public class User {
	String email;
	String password;

	public User() {

	}

	public User(String email, String password) throws Exception {
		super();
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		if (email.length() < 6 && email.contains("@")) {
			throw new Exception("Error");
		} else {
			this.email = email;
		}
	}

	public String getPassword(String password) {

		return password;
	}

	public void setPassword(String password) throws Exception {
		if (password.length() <= 6 && password.contains("\\d")) {
			throw new Exception("Lipsva cifra v parolata ");
		} else {
			this.password = password;
		}
	}
}
