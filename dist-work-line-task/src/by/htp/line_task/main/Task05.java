package by.htp.line_task.main;

//5. ��������� �������� ���������� �������� ��������������� ���� �����

import java.util.Scanner;


public class Task05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		
		double result;
		
		System.out.print("������� �������� ��� ������� �����: ");
		a = sc.nextDouble();
		System.out.print("������� �������� ��� ������� �����: ");
		b = sc.nextDouble();
		
		result = (a + b) / 2;
		
		System.out.print("������� �������������� ������ ����� ����� =  " + result);
		
	}

}
