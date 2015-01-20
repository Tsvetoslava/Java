public class Name {

	public static void main(String[] args) {

	
		String izr = "hjfhf e Petur Martin";

		String[] imena = { "Ivan", "Petur", "Martin", "Georgi", "Pesho" };

		for (String string : imena) {
			if (izr.endsWith(string)) {
				System.out.println("Изречението завършва с  "+string);
			} else if (izr.startsWith(string)) {
				System.out.println("Изречението започва с "+string);
			} else if (izr.contains(string)) {
				System.out.println("Изречението съдържа  "+string);
			}
		}

		
		
		
	
	}

}
