package by.htp.line_task.main;

//29. ����� (� �������� � ��������) ��� ���� ������������ �� ��������� �, b, �.

import java.util.Scanner;


public class Task29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double grad1;
		double rad1;
		double grad2;
		double rad2;
		double grad3;
		double rad3;

		System.out.print("������� �������� a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� b: ");
		b = sc.nextDouble();
		System.out.print("������� �������� c: ");
		c = sc.nextDouble();
		
		rad1 = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		grad1 = rad1 * 180 / Math.PI;
		rad2 = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		grad2 = rad2 * 180 / Math.PI;
		grad3 = 180 - grad1 - grad2;
		rad3 = grad3 * Math.PI / 180;
		
		System.out.println("���� ������������ ����� " );
		System.out.println("����1 = " + grad1 + " ��������" + " ��� " + rad1 + " ������" );
		System.out.println("����2 = " + grad2 + " ��������" + " ��� " + rad2 + " ������" );
		System.out.println("����3 = " + grad3 + " ��������" + " ��� " + rad3 + " ������" );
		
		
	}

}
