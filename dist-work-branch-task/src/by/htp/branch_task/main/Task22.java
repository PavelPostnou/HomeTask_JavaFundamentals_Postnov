package by.htp.branch_task.main;

/*22. ���������������� �������� ���������� � � � ���, 
����� � � ��������� ������� �� ���� ��������, � � y - �������. */

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double x;
		double y;
		
		System.out.print("������� �������� ��� x: ");
		x = sc.nextDouble();
		System.out.print("������� �������� ��� y: ");
		y = sc.nextDouble();
		
		if (y>x)
		{
			double temp;
			
			temp = x;
			x = y; 
			y = temp;
		}

		System.out.print("x = " + x + " y = " + y);
	}

}
