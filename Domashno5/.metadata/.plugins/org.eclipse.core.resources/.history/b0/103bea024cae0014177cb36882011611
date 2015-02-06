/*Направете клас Town с полета Име, Държава и Население
Направете HashSet  с Тоwn и добавете 5 града
Проверете дали сета съдържа град с име, дръжава и 
население точно равни на първият създаден град
Премахнете град с име, дръжава и население точно равни на 3тия създаден град
 */

import java.util.HashSet;

public class TownController {

	public static void main(String[] args) {
		Town town1 = new Town("Sofia", "Bulgaiq", 2000000);
		Town town2 = new Town("NY", "USA", 20000000);
		Town town3 = new Town("Plovdiv", "Bulgaiq", 400000);
		Town town4 = new Town("Berlin", "Germany", 3500000);
		Town town5 = new Town("Vienna", "Austria", 1700000);

		HashSet<Town> town = new HashSet<Town>();

		town.add(town1);
		town.add(town2);
		town.add(town3);
		town.add(town4);
		town.add(town5);

		System.out.println(town);
		System.out.println(town.contains(town1));
		town.remove(town5);
		System.out.println(town);
	}
}
