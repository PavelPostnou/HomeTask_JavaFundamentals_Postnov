package by.htp.branch_task.main;

/*24. ��������� ���������, ������������ ��������� ������� �� ������� � 
�������� �����, ���� �� �������� ������ ���������� ��������� �.*/

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		
		System.out.print("������� ���������� ���������: ");
		count = sc.nextInt();
		
		if (count % 2 == 0) 
		{
		System.out.println("�� �����");	
		}
		else 
		System.out.println("�����");	
		
	}

}
