package by.htp.omas_task.main;

/*3. ���� ������������������ ����� ����� �1 �2,..., �n . ��������, ����� ����� �����������
������ - ������������� ��� �������������.*/

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("������� ������ �������: ");
		n = sc.nextInt();
		
		int a [] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
		    a[i] = (int)((Math.random() * 100) - 50);
		    System.out.println(a[i]);
		}
		
		if (a[0] < 0)
		{
			System.out.println("������ ����� �������������: " + a[0]);
		}
		if (a[0] >= 0)
		{
			System.out.println("������ ����� �������������: " + a[0]);
		}


	}

}
