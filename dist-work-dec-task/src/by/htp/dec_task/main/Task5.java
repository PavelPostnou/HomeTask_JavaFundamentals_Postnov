package by.htp.dec_task.main;

/*5. �������� �����(������) ��� ���������� ����� �������� � �������� �� ���� �����.*/

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		int y;
		int z;
		
		System.out.print("������� ������ �����: ");
		x = sc.nextInt();
		System.out.print("������� ������ �����: ");
		y = sc.nextInt();
		System.out.print("������� ������ �����: ");
		z = sc.nextInt();
		
		Sum (x, y, z);
		

	}
	
	public static void Sum (int x, int y, int z) 
	{
		int max;
		int min;
		int sum;
		
		max = 0;
		min = 0;
		
		if (x >= y && x >= z)
		{
			max = x;
		}
		
		if (y >= z && y >= z)
		{
			max = y;
		}
		
		if (z >= y && z >= x)
		{
			max = z;
		}
		if (x <= y && x <= z)
		{
			min = x;
		}
		
		if (y <= x && y <= z)
		{
			min = y;
		}
		if (z <= x && z <= y)
		{
			min = z;
		}
		
		sum = min + max;
		
		System.out.print(sum);
	}
	

}
