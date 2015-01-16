import java.util.ArrayList;
import java.util.HashMap;


public class Library {
private String name;
private String address;

ArrayList<KOPIQ> knigi = new ArrayList<KOPIQ>();

public ArrayList<KOPIQ> getKnigi() {
	return knigi;
}



public Library(String name, String address, HashMap<Book, Integer> kopiq) {
	this();
	setName(name);
	setAddress(address);
	setKnigi(knigi);
}
public void setKnigi(ArrayList<KOPIQ> knigi) {
	this.knigi = knigi;
}

public Library() {
	this.name = "";
	this.address = "";
	

}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}




public void addBook(Book book) {
	knigi.add(new KOPIQ(book, 1));
}

public void addBookCopy(String ime) {	
	
	for(KOPIQ w:knigi)
	{
		if(w.getBook().getIme().equals(ime))
		{
			int newCnt = w.getKopiq()+1;
			w.setKopiq(newCnt);
		
		}

	}
	
}

public void removeBook(Book book) {
	knigi.remove(book);
}
	
public void removeBookCopy(String ime) {
	for(KOPIQ w:knigi)
	{
		if(w.getBook().getIme().equals(ime))
		{
			int newCnt = w.getKopiq()-1;
			w.setKopiq(newCnt);
		
		}

	}

}



@Override
public String toString() {
	return "Library [getKnigi()=" + getKnigi() + ", getName()=" + getName()
			+ ", getAddress()=" + getAddress() + "]";
}
}

