/*��������� �������� ����� �� ��� String � �������� �������������, ����� �� ������������ �������.
 ��������� ������������ ���� � ��������� ���� �� ������ ��� ������ �� ������� 3 ���� ����, �� ������ � 6 ���� �������, � �� ������ 2 ���� �������. 
����������� ��������� �� ������ ��� ����:
����:  �..
�������: ��.
�������: ��..
 */

package Domashno3;

public class Upr1 {

	public static void main(String[] args) {
		String[][] menu = new String[][] {
				new String[] { "Sypu: ", "supa1", "supa2", "supa3" },
				new String[] { "Osnovni: ", "osnovno1", "osnovno2", "osnovno3",
						"osnovno4", " osnovno5", " osnovno6" },
				new String[] { "Desetri: ", "desert1", "desert2" },
		};
		
		System.out.println("    Menu");
		System.out.println("   ******");

		for (int i = 0; i < menu.length; i++) {
			for (int j = 0; j < menu[i].length; j++) {

				System.out.printf(menu[i][j]);
				if (j != 0 && j != menu[i].length - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}
