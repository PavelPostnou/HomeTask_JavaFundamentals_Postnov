package by.htp.branch_task.main;

/*�������� ���������, ������� �� ������ ����� ���������� 
������� ������� ���������� � ��������� ���������� � ���� ������.
������ � ���� ����� ������ ����� �������, �������� �� ��� ������
�� ������� �������. ��� ����� ��������� ������:
9583, 1747 � �������� ������ ��� �, �, �;
3331, 7922 � �������� ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.*/

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		
		System.out.print("������� ������: ");
		x = sc.nextInt();
		
		if (x == 9583 || x == 1747)
		{
			System.out.print("��� �������� ������ ��� A,B,C");
		}
		
		else if (x == 3331 || x == 7922)
		{
			System.out.print("��� �������� ������ ��� B,C");
		}
		
		else if (x == 9455 || x == 8997)
		{
			System.out.print("��� �������� ������ ���� C");
		}
		
		else
		{
				System.out.print("����� �������� ������");
		}
	}

}
