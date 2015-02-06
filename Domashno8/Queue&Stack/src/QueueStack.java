/*Напишете програма, която приема символен низ от конзолата и го обработва както следва:
Ако срещне малка буква – буквата се поставя  в опашка
Ако срещне голяма буква -  буквата се поставя в стек
Изведете данните от опашката и стека на екрана.
Примерен низ
АоВбиАчЖаДм
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {

	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		String str = "АоВбиАчЖаДм";
		char[] cSTR = str.toCharArray();

		for (char c : cSTR) {
			String currentChar = Character.toString(c);
			if (currentChar.equals(currentChar.toUpperCase())) {
				myStack.push(currentChar);
			} else if (currentChar.equals(currentChar.toLowerCase())) {
				queue.add(currentChar);
			}
		}

		while (!queue.isEmpty()) {
			System.out.print(queue.remove());
		}

		System.out.println();
		while (!myStack.isEmpty()) {
			String current = myStack.pop();
			System.out.print(current);
		}
	}
}
