package by.htp.cycle_task.main;

/*27. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, �����
������� � ������ �����. m � n �������� � ����������.*/

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		int m;

		System.out.print("������� ������ �����: ");
		n = sc.nextInt();
		System.out.print("������� ������ �����: ");
		m = sc.nextInt();
		
		for (int x = n; x <= m; x++)
		{
			System.out.print("����� " + x + " ������� ��: ");
			for (int y = 2; y <= x-1; y ++)
			{
				
			if (x % y == 0)
			{
				System.out.print(y + ", ");
				
			}
				
			}
			System.out.println();
		}
	}

}
