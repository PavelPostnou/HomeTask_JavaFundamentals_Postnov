package by.htp.cycle_task.main;

/*21. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � �����
h. ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������,
������ - ��������������� �������� �������:
F(x) = x - sin(x)*/

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double h;
		
		System.out.print("������� �������� a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� b: ");
		b = sc.nextDouble();
		System.out.print("������� ��� h: ");
		h = sc.nextDouble();
	
		double fx;
		
		for (double x = a; x <= b; x = x + h)
		{
			fx = x - Math.asin(x);
			
			System.out.println("|x = " + x + "|fx = " + fx + "|");
		}
	}

}
