package by.htp.line_task.main;

//20. �������� ����� ����������. ����� ������� �����, ������������� ���� �����������.

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double length;
		
		System.out.print("������� ����� ����������: ");
		length = sc.nextDouble();
		
		double square;
		
		square = Math.pow(length, 2) / (4 * Math.PI);
		
		System.out.print("������� ����� ����� = " + square);
	}

}
