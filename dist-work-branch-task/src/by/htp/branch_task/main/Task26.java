package by.htp.branch_task.main;

/*26. �������� ��������� ���������� ����� ��������
� �������� �� ���� �����.*/

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x1;
		int x2;
		int x3;
		
		int max = 0;
		int min = 0;
		System.out.print("������� ������ �����: ");
		x1 = sc.nextInt();
		System.out.print("������� ������ �����: ");
		x2 = sc.nextInt();
		System.out.print("������� ������ �����: ");
		x3 = sc.nextInt();
		
		if (x1 >= x2 && x1 >= x3)
		{
			max = x1;
		}
		else if (x2 >= x1 && x2 >= x3)
		{
			max = x2;
		}
		else if (x3 >= x1 && x3 >= x2)
		{
			max = x3;
		}
		
		
		if (x1 <= x2 && x1 <= x3)
		{
			min = x1;
		}
		else if (x2 <= x1 && x2 <= x3)
		{
			min = x2;
		}
		else if (x3 <= x1 && x3 <= x2)
		{
			min = x3;
		}
		
		
		int sum;
		
		sum = max + min;
		
		System.out.print("����� �������� � �������� �� ��� ����� ����� = " + sum);
	}

}
