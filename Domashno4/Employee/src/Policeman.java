
public class Policeman extends Employee{

	private String rank;
	
	
	public Policeman(){
		super();
		this.rank="";
	}
	
	public Policeman(String rank,int chasove,double zaplata){
		super(chasove, zaplata);
		setRank(rank);
	}
	
	public String getRank(){
		return rank;
	}
	
	public void setRank(String rank){
		this.rank=rank;
	}
	
	public String toString(){
		return "Policeman: rankut e  "+getRank()+ super.toString();
	}
}
