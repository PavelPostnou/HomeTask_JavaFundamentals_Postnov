package by.htp.line_task.main;

//24. ����� ������� �������������� �������� � ����������� � � b � ����� a ��� ������� ��������� a.

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double ang;
		
		System.out.print("������� ����� �������� ���������: ");
		a = sc.nextDouble();
		System.out.print("������� ����� �������� ���������: ");
		b = sc.nextDouble();
		System.out.print("������� ���� < 90: ");
		ang = sc.nextDouble();
		
		double sq;
		
		sq = (a*b) / Math.abs(Math.sin(ang));
		
		System.out.print("������� �������� ����� = " + sq);
	}

}
