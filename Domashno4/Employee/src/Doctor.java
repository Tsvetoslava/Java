
public class Doctor extends Employee {

	int days;
	int nights;
	
	
	public Doctor(){
		super();
		this.days=0;
		this.nights=0;
	}
	
	public Doctor(int chasove,double zaplata,int days,int nights){
		super(chasove,zaplata);
		setNights(nights);
		setDays(days);
	}
	
	public void setDays(int days){
		this.days=days;
	}
	
	public int getDays(){
		return days;
	}
	public void setNights(int nights){
		this.nights=nights;
	}
	public int getNights(){
		return nights;
	}

	@Override
	public String toString() {
		return "Doctor: dvevni dejurstv" + getDays() + ",noshtni dejurstva "
				+ getNights() + super.toString() + "]";
	}
	
}
