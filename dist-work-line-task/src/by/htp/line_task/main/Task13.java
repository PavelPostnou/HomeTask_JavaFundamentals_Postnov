package by.htp.line_task.main;

//13. ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). ����� ��� �������� � �������.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		double perimetr;
		double square;
		
		System.out.print("������� �������� ��� ������ ���������� x1: ");
		x1 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� y1: ");
		y1 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� x2: ");
		x2 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� y2: ");
		y2 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� x2: ");
		x3 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� y2: ");
		y3 = sc.nextDouble();
		
		double one = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
		double two = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3 - y2, 2));
		double three = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3 - y1, 2));
		
		perimetr = one + two + three;
		
		double polperimetr = perimetr/2;
		
		square = Math.sqrt(polperimetr * (polperimetr - one) * (polperimetr - two) * (polperimetr - three));
				
		System.out.println("�������� ��������� ������������� ����� = " + perimetr);
		System.out.println("������� ��������� ������������� ����� = " + square);
	}

}
