package by.htp.line_task.main;

//28. ��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������.

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double rad;
		double grad;
		double min;
		double sec;
		
		System.out.print("������� �������� � ��������: ");
		rad = sc.nextDouble();
		
		grad = rad * 180 / Math.PI;
		min = (grad%1) * 60;
		sec = (min%1) * 60;
		grad = (int) grad;
		min = (int) min;
		sec = (int) sec;
		
		System.out.print("�������� ���� ����� " + grad + " �������� " + min + " ����� " + sec + " ������");
		
		
		
		
		

	}

}
