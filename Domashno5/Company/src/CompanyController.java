import java.util.ArrayList;


public class CompanyController {
public static void main(String[] args) {
	
	
	
	
	Company c1 = new Company("Credissimo", "BG","credissimo.bg", 654);
	Company c2 = new Company("Vivacom","BG","vivacom.bg", 35785 );
	Company c3 = new Company("Telenor","BG","telenor.bg", 27000 );
	ArrayList<Company> companies = new ArrayList<Company>();
	
	
	
	companies.add(c1);
	companies.add(c2);
	companies.add(c3);
	
	
	
	int max = 0;
	int delete = 0;
	for(int j = 0; j < companies.size(); j++)
	{
		if(companies.get(j).getCountEmployee()> max)
		{	delete = j;
			max = companies.get(j).getCountEmployee();
		}
	}
	
	 companies.remove(delete);
	 
	 
	 
	 Company c4 = new Company("Mtel","BG","mtel.bg", 654 );
	 Company c5 = new Company("Vivus","BG","vivus.bg", 2020);
	 companies.add(c4);
	 companies.add(c5);
	 int maxLength = 0;
	 int removeName = 0;
	 for(int i = 0; i < companies.size(); i++)
		{
			if(companies.get(i).getName().length()> maxLength)
			{	
				removeName=i;
				maxLength = companies.get(i).getName().length();
			}
		}
	
	 
	 companies.remove(removeName);
	 Company c6 = new Company("CashBox","BG","cashbow.bg", 4500);
	 companies.add(removeName, c6);
	 
	 
	 
	 for (Company company : companies) {
		System.out.println(company.toString());
	}
}
	

	
}
