package by.htp.mmas_task.main;

/*10. ���� �������. ������� k-� ������ � p-� ������� �������.*/

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		n=5;
		m=5;
		
		int mas [][] = new int [n][m];
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				mas [i][j] = (int)(Math.random() * 15 - 5);
				
				System.out.print (mas [i][j] + " | ");
				
			}
			System.out.println();
		}
		
		int k;
		int p;
		
		System.out.println("������� ����� ������ ��� ������: ");
		k = sc.nextInt();
		
		for (int i = 0; i < m; i++)
		{
			
			System.out.print (mas [k][i] + " | ");
			
		}
		
		System.out.println();
		
		System.out.println("������� ����� ������� ��� ������: ");
		p = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			
			System.out.println (mas [i][p] + " | ");
			
		}
	}

}
