
public class Drink extends Stock{
private boolean isAlcohol;
private String name;




public Drink() {
	super();
	this.isAlcohol = false;
	this.name = "";
}
public Drink(double price, boolean isAvailable,boolean isAlcohol, String name) {
	super(price, isAvailable);
	setAlcohol(isAlcohol);
	setName(name);
}





public boolean isAlcohol() {
	return isAlcohol;
}
public void setAlcohol(boolean isAlcohol) {
	this.isAlcohol = isAlcohol;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Drink [isAlcohol()=" + isAlcohol() + ", getName()=" + getName()
			+ "]";
}




}
