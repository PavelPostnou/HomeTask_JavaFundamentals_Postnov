package by.htp.omas_task.main;

/*15. ���� ������������������ �������������� ����� n a ,a , ,a 1 2  . ������� �� �� ��������,
������� ����������� ������� [�, d].*/

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);

		int n;
		int c;
		int d;
		
		System.out.print("������� ������ �������: ");
		n = sc.nextInt();
		System.out.print("������� ������ �������: ");
		c = sc.nextInt();
		System.out.print("������� ����� �������: ");
		d = sc.nextInt();
		
		double a [] = new double [n];
		
		for (int i = 0; i < a.length; i++) {
		    a[i] =(Math.random() * 100) - 50;
		    System.out.println(a[i]);
		}
		
		System.out.println("��������, ������������� �������: ");
		
		for (int i = 0; i < a.length; i++) {
			
		   if (c <= a[i] && a[i] <= d)
		   {
			   System.out.println(a[i]);
		   }
		}

	}

}
