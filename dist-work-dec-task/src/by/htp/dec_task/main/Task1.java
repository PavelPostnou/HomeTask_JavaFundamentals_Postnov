package by.htp.dec_task.main;

/*����������� ����� ������������ ����� ������. �������� ����� ��� ���������� ���
�������.*/

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		
		System.out.print("������� ���������� � ������ �������: ");
		x1 = sc.nextInt();
		System.out.print("������� ���������� y ������ �������: ");
		y1 = sc.nextInt();
		System.out.print("������� ���������� � ������ �������: ");
		x2 = sc.nextInt();
		System.out.print("������� ���������� y ������ �������: ");
		y2 = sc.nextInt();
		System.out.print("������� ���������� � ������� �������: ");
		x3 = sc.nextInt();
		System.out.print("������� ���������� y ������� �������: ");
		y3 = sc.nextInt();
		
		double d1;
		double d2;
		double d3;
		
		d1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
		d2 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2, 2));
		d3 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1, 2));
		
		Square (d1,d2,d3);
		
		
	}

	public static void Square (double x, double y, double z)
	{
		double p;
		double s;
		
		p = (x+y+z) / 2;
		
		s = Math.sqrt(p * (p - x) * (p - y) * (p - z));
		
		System.out.print("������� ������������ ����� = " + s);
		
	}
}
