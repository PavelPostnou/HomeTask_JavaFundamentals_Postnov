package by.htp.line_task.main;

/*27. ���� �������� a. �� ��������� ������� ������� � ������� ��������, �����
���������, �������� �������� �8 �� ��� �������� � �10 �� ������ ��������.*/

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		System.out.print("������� �������� a: ");
		a = sc.nextDouble();
		
		double temp;
		
		temp = a * a;
		a = temp * temp;
		a = a * a;
		
		System.out.println("a � ������� ������� ����� = " + a);
		
		a = temp * a;
		
		System.out.println("a � ������� ������� ����� = " + a);
		
		
		
		
		

	}

}
