/*��������� ���� Company � 4 ������: ��� �����, ���� ��������� � web ��������
��������� List � 3 ���������� ��������
�������� ���������� � ���-����� ��������� � � ���������� �� �������
�������� ��� 2 ��������
�������� ��� 1 �������� �� ������� �� ���������� � ���-����� ���
 */

public class Company {
	private String name;
	private String address;
	private String web;
	private int countEmployee;

	public Company() {

	}

	public Company(String name, String address, String web, int countEmployee) {
		super();
		setName(name);
		setAddress(address);
		setWeb(web);
		setCountEmployee(countEmployee);
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

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getCountEmployee() {
		return countEmployee;
	}

	public void setCountEmployee(int countEmployee) {
		this.countEmployee = countEmployee;
	}

	@Override
	public String toString() {
		return "Company [getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getWeb()=" + getWeb()
				+ ", getCountEmployee()=" + getCountEmployee() + "]";
	}
}
