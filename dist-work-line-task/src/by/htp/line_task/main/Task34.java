package by.htp.line_task.main;

/*34. ���� �������� �, ���������� ����� ���������� � ������.
��������� � � ����� ������� ������� ��������� ����������.*/

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double kb;
		double mb;
		double gb;
		
		System.out.print("������� ����� ���������� � ������: ");
		a = sc.nextDouble();
		
		kb = a / 1000;
		mb = kb / 1000;
		gb = mb / 1000;
		
		System.out.println("����� ���������� � ������ ����� = " + a);
		System.out.println("����� ���������� � ���������� ����� = " + kb);
		System.out.println("����� ���������� � ���������� ����� = " + mb);
		System.out.println("����� ���������� � ���������� ����� = " + gb);
	}

}
