package by.htp.line_task.main;

//14. ��������� ����� ���������� � ������� ����� ������ � ���� �� ��������� ������� R.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r;
		
		double length;
		double square;
		
		System.out.print("������� ������: ");
		r = sc.nextDouble();

		length = 2*Math.PI*r;
		square = Math.PI*Math.pow(r, 2);
		
		System.out.println("����� ���������� ����� = " + length);
		System.out.print("������� ����� ����� = " + square);
		
	}

}
