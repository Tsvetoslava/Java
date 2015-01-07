
public class Shop {

	private String name;
	private String location;
   Stock [] stock;
   
   
public Shop() {
	super();
	this.name = "";
	this.location ="";
	this.stock = null;
}

public Shop(String name, String location, Stock[] stock) {
	super();
	setName(name);
	setLocation(location);
	setStock(stock);
}



public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}

public Stock[] getStock() {
	return stock;
}

public void setStock(Stock[] stock) {
	this.stock = stock;
}



	
}
