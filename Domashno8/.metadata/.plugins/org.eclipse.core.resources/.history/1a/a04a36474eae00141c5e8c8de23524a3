/*Ќапишете програма, ко€то приема символен низ от конзолата и го обработва както следва:
јко срещне малка буква Ц буквата се постав€  в опашка
јко срещне гол€ма буква -  буквата се постав€ в стек
»зведете данните от опашката и стека на екрана.
ѕримерен низ
јо¬бијч∆аƒм
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {

	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		String str = "јо¬бијч∆аƒм";
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
