package by.htp.branch_task.main;

/*23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12).
���� ������� ������������ ������, �� �������� �� ����.*/

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int month;
		int date;
		
		System.out.print("������� ����� ������: ");
		date = sc.nextInt();
		
		if (date < 1 || date > 31)
		{
			System.out.println ("�� ����� ������������ ������");
		}
		
		System.out.print("������� ����� ������: ");
		month = sc.nextInt();
		
		if (month < 1 || date > 31)
		{
			System.out.println (" �� ����� ������������ ������");
		}


	}

}
