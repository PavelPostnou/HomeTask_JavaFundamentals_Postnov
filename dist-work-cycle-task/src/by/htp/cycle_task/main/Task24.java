package by.htp.cycle_task.main;

/*24. �������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������.
������������� ��� � ������ �����, ����� �������� ����� ��������� � �������� ������� ��
��������� � ��������� ������.*/

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		int sum;
		
		sum = 0;
		
		
		int nn;
		
		nn = 0;
		
		System.out.print("������� �����: ");
		n = sc.nextInt();
		
		int temp;
		
		while (n > 0)
		{
			
			temp = n % 10;
		
			if (temp % 2 == 0)
			{
				sum = sum + temp;
				
			}
			
			nn = nn * 10 + temp;
			
			n = n / 10;
		
		}
		
		System.out.println("����� ������ ���� ����� ����� = " + sum);
		System.out.println("���������� ����� ����� = "+ nn);

	}

}
