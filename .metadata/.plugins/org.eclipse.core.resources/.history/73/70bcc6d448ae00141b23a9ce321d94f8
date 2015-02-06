/*С помощта на функции в JAVA направете програма,
която пресмята лицето на триъгълник по зададена страна и височина към нея. (S=a.ha/2).
На случаен принцип генерирайте 10 различни страни и съответно височини към тях
и изведете лицето на образувания от тях триъгълник на екрана
Дефинирайте функция за пресмятането на лицето
Дефинирайте функция за извеждането на страната, височината и лицето
 */

package Domashno3;

import java.util.Random;

public class Upr2 {

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			float width = rand.nextFloat();
			float height = rand.nextFloat();

			float area = area(width, height);
			print(area, width, height);
		}
	}

	public static float area(float width, float height) {
		float area = (width * height) / 2;
		return area;
	}

	public static void print(float area, float width, float height) {
		System.out.printf("Width %f Height %f = Area %f", width, height, area);
		System.out.println();
	}
}
