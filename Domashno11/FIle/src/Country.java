import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class Country {
	
		public static void main(String[] args) {

			String filePath = "../output/countries.txt";
			String filePathTwo = "../output/stolici.txt";
			Scanner input = new Scanner(System.in);
			try {
				FileWriter fileStream = new FileWriter(filePath);
				FileWriter fileStream2 = new FileWriter(filePathTwo);
				BufferedWriter writer = new BufferedWriter(fileStream);
				BufferedWriter writer2 = new BufferedWriter(fileStream2);

				System.out.println("Vuvedi 5 durjavi i 5 grada: ");

				for (int a = 0; a < 5; a++) {
					String country = input.nextLine();
					String[] countryOne = country.split(" ");

					writer.write(countryOne[0]);
					writer.newLine();
					writer2.write(countryOne[1]);
					writer2.newLine();

				}

				writer.close();
				writer2.close();
				input.close();

			} catch (Exception e) {
				System.out.println("Възникна грешка при записа на файла");
				System.out.println(e.getMessage());
			}

			System.out.print("Записът на файла приключи! \n");
		}
	}

