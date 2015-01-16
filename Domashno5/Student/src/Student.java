import java.util.ArrayList;
import java.util.HashMap;


public class Student {

	private String ime;
	private String familiq;
	private int nomer;
	HashMap<String , ArrayList<Integer>> ocenki = new HashMap<>();
	
	

	public Student() {
	this.ime=" ";
	this.familiq=" ";
	this.nomer=0;
	
	}
	public Student(String ime, String familiq, int nomer,
			HashMap<String, ArrayList<Integer>> ocenki) {
		super();
		setIme(ime);
		setFamiliq(familiq);
		setNomer(nomer);
		setOcenki(ocenki);
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getFamiliq() {
		return familiq;
	}
	public void setFamiliq(String familiq) {
		this.familiq = familiq;
	}
	public int getNomer() {
		return nomer;
	}
	public void setNomer(int nomer) {
		this.nomer = nomer;
	}
	public HashMap<String, ArrayList<Integer>> getOcenki() {
		return ocenki;
	}
	public void setOcenki(HashMap<String, ArrayList<Integer>> ocenki) {
		this.ocenki = ocenki;
	}
	
	
	public void addSubjectMark(String predmet , int ocenka)
	{
		ocenki.get(predmet).add(ocenka);
	}
	
	
	public void calculateAverageMark(String subject)
	{
		ocenki.get(subject);
		double sum=0;
		for(int i = 0 ; i<ocenki.get(subject).size();i++)
		{
			sum += ocenki.get(subject).get(i);
		}
		System.out.println(sum/ocenki.get(subject).size());
		
	}
	
	
	
	
}
