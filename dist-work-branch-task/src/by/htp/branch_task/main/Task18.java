package by.htp.branch_task.main;

//18. ���������� ���������� ������������� ����� ����� �, b, �.

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("������� ������ �����: ");
		a = sc.nextInt();
		System.out.print("������� ������ �����: ");
		b = sc.nextInt();
		System.out.print("������� ������ �����: ");
		c = sc.nextInt();
		
		int count;
		count = 0;
		
		if (a < 0)
		{
			count ++;
		}
		
		if (b < 0) 
		{
			count ++;
		}
		
		if(c < 0)
		{
			count ++;
		}
		
		System.out.print("���������� ������������� ����� ����� = " + count);
		
		}
	}


