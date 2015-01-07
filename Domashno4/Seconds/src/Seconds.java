
public class Seconds {

	private final int hours=24;
	private final int minutes=60;
	private final int seconds=60;
	
	public Seconds(){
		this.second=0;
	}
	
	
	
	public Seconds(int seconds){
		this();
		setSeconds(seconds);
		}
	
	
	
	public void setSeconds(int seconds){
		if(seconds>0){
		this.second=seconds;
		}
	}
	
	public int getSeconds(){
			return second; 
		}
	
	public void printSeconds(){
		this.second=hours*minutes;
	}
	
	}

