package by.htp.line_task.main;

//12. ��������� ���������� ����� ����� ������� � ������� ������������ (�1, �1)� (x2, �2)

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1;
		double x2;
		double y1;
		double y2;
		
		double dist;
		
		System.out.print("������� �������� ��� ������ ���������� x1: ");
		x1 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� y1: ");
		y1 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� x2: ");
		x2 = sc.nextDouble();
		System.out.print("������� �������� ��� ������ ���������� y2: ");
		y2 = sc.nextDouble();
		
		dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.print("���������� ����� ����� ������� = " + dist);

	}

}
