package by.htp.line_task.main;

/*26. ����� ������� ������������, ��� ������� �������� ����� � � b, � ���� ����� �����
��������� �.*/

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double y;
		
		double sq;
		
		System.out.print("������� �������� a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� b: ");
		b = sc.nextDouble();
		System.out.print("������� �������� y: ");
		y = sc.nextDouble();
		
		sq = (a * b * Math.sin(y)) / 2;
		
		System.out.print("������� ������������ ����� = " + sq);
		
		

	}

}
