package by.htp.line_task.main;

/*25. ��������� ����� ����������� ��������� ��2+ b� + � = 0 � ��������� ��������������
a, b � � (��������������, ��� �!=0 � ��� ������������ ��������� �������������).*/

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		
		double D;
		
		System.out.print("������� �������� a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� b: ");
		b = sc.nextDouble();
		System.out.print("������� �������� c: ");
		c = sc.nextDouble();
		
		D = Math.pow(b,2) - 4 * a * c;
		
		double x1;
		double x2;
		
		x1 = (-b - Math.sqrt(D)) / (2 * a);
		x2 = (-b + Math.sqrt(D)) / (2 * a);
		
		System.out.println("����� ���������: x1 = " + x1 + ", x2 = " + x2);
	}

}
