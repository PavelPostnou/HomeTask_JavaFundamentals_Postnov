package by.htp.branch_task.main;

//20. ����������, ��������� ����� ����� �, b, � �������� ����� k.

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double k;
		
		System.out.print("������� �������� ��� a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� ��� b: ");
		b = sc.nextDouble();
		System.out.print("������� �������� ��� c: ");
		c = sc.nextDouble();
		System.out.print("������� �������� ��� k: ");
		k = sc.nextDouble();
		
		if (a % k == 0)
		{
			System.out.println(k + " �������� ��������� ����� " + a);
		}
		
		if (b % k == 0) 
		{
			System.out.println(k +" �������� ��������� ����� " + b);
			
		}
		
		if (c % k == 0) 
		{ 
			System.out.println(k +" �������� ��������� ����� " + c);
		}
		
		else if (a % k != 0 && b % k != 0 && c % k != 0 )
		{
			System.out.println(" �� �������� ��������� �� ������ �� ���������� �����");
		}
	}

}
