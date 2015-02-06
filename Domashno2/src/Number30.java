/*Направете програма която принитра на конзолата всички карти
 *  от стандартанта колода за игра. Подредете информацията в 13 реда и 4 колони
 */
public class Number30 {

	public static void main(String[] args) {
		int counter = 30;

		for (int rows = 5; rows >= 1; rows--) {
			for (int columns = 6; columns >= 1; columns--) {
				if (counter <= 9) {
					System.out.print(counter + "  ");
				} else {
					System.out.print(counter + " ");
				}
				counter--;
			}
			System.out.println();
		}
	}
}
