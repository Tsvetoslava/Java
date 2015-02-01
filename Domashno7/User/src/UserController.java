/*Направете клас за потребител съдържащ полета за e-mail и парола.
Направете валидация за двете полета, като при намиране на
 невалидни данни създавайте изключения:
Валиден e-mail: над 5 символа, съдържа @ и .
Валидна парола: съдържа минимум 6 символа и поне една цифра
Създайте програма, която приема данни за 3 потребителя и 
обработва коректно възможните изключения
 */

public class UserController {

	public static void main(String[] args) throws Exception {
		try {
			User user1 = new User("cecka@abv.bg", "34534");
			User user2 = new User("iivanov@abv.bg", "hjgjhbj");
			User user3 = new User("g,georgiev@abv.bg", "gfd86fdg");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
