
public class Celsius {
public double gradus;
  
  
  
  public Celsius() {
		
		this.gradus =0;
	}

public Celsius(double gradus) {
	this();
	setGradus(gradus);
}



public double getGradus() {
	return gradus;
}

public void setGradus(double gradus) {
	this.gradus = gradus;
}


public void printFahrenheit(){
	double result= (this.gradus* 1.8) + 32;
	System.out.println(result);
}
}
