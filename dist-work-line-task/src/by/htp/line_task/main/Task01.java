package by.htp.line_task.main;

//1. ���� ��� �������������� ����� � � �. ��������� �� �����, ��������, ������������ � �������.

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		double result;
		
		System.out.print("������� �������� ��� x: ");
		x = sc.nextDouble();
		System.out.print("������� �������� ��� y: ");
		y = sc.nextDouble();
		
		result = x+y;
		System.out.println("��������� �������� = " + x + " + " + y + " = " + result);
		
		result = x-y;
		System.out.println("��������� ��������� = " + x + " - " + y + " = " + result);
		
		result = x*y;
		System.out.println("��������� ��������� = " + x + " * " + y + " = " + result);
		
		result = x/y;
		System.out.print("��������� ������� = " + x + " / " + y + " = " + result);
	}

}
