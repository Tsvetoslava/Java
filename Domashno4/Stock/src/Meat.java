
public class Meat extends Stock{

private String name;
private String date;




public Meat(boolean isAvailable,double price,String name, String date) {
	super(price,isAvailable);
	 setName(name);
	 setDate(date);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Meat [getName()=" + getName() + ", getDate()=" + getDate() + "]";
}





}
