import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentRead {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		readFile("C:\\students.txt", student);

	}

	public static void readFile(String path, ArrayList<Student> student) {
		try {

			FileReader fileReader = new FileReader(path);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				String[] red = line.split(" ");
				Student current = new Student(red[0], red[1]);
				System.out.println(current);
			}
			bufferedReader.close();

		} catch (Exception e) {
			System.out.println("Error");
			System.out.println(e.getMessage());
		}
	}
}
