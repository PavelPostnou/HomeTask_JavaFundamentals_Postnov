package by.htp.line_task.main;

//11. ��������� �������� � ������� �������������� ������������ �� ������ � � b ���� �������.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		
		double square;
		double perimetr;
		
		System.out.print("������� �������� ��� ������ a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� ��� ������ b: ");
		b = sc.nextDouble();
		
		square = (a + b) / 2;
		perimetr = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
		
		System.out.println("������� ������������ ����� = " + square);
		System.out.println("�������� ������������ ����� = " + perimetr);
		
	}

}
