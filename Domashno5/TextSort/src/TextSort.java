/*Направете програма, която приема текст и 
извежда на екрана всички думи, подредени по
азбучен ред. Думите, които се срещат поче от 
веднъж трябва да бъдат изведени само един път
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class TextSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		String[] words = text.split("\\W+");
		System.out.println(words.length);

		ArrayList<String> arrayL = new ArrayList<String>(Arrays.asList(words));
		Collections.sort(arrayL);

		int count = 0;
		for (int i = 0; i < arrayL.size(); i++) {
			System.out.println(arrayL.get(i));
			for (int j = 0; j < arrayL.size(); j++) {
				if (arrayL.get(i).equals(arrayL.get(j)))
					count++;
				if (arrayL.get(i).equals(arrayL.get(j)) && count > 1)
					arrayL.remove(j);
			}
			count = 0;
		}
	}
}
