package by.htp.line_task.main;

/*31. ��������� ��������� ��� ���������� ����, ����������� ������, ���� �� �������� �
������� ���� v ��/�, �������� ������� ���� v1 ��/�, ����� �������� �� ����� t1 �, � ������
������� ���� � t2 �.*/

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double v;
		double v1;
		double t1;
		double t2;
		
		System.out.print("������� �������� ����� ��/�: ");
		v = sc.nextDouble();
		System.out.print("������� �������� ������� ���� ��/�: ");
		v1 = sc.nextDouble();
		System.out.print("������� ����� �������� �� ����� �.: ");
		t1 = sc.nextDouble();
		System.out.print("������� ����� �������� ������ ������� �.: ");
		t2 = sc.nextDouble();
		
		double dist;
		
		dist = v * t1 + (v-v1) * t2; 
		
		System.out.print("����������, ���������� �������, ����� = " + dist + " ��");
		
		
		
	}

}
