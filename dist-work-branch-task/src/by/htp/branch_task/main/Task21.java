package by.htp.branch_task.main;

import java.io.IOException;

/*21. ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻. 
 * � ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� �������� ��������!�.*/
 
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		
		char l;
		
		System.out.println("��� ��: ������� ��� �������? ");
		l = (char)System.in.read();
		
		System.out.println(l);
		
		if ( l == 'g')
		{
			System.out.println("��� �������� �������");
		}
		
		if (l == 'b')
		{
			System.out.println("��� �������� ��������");
		}
	}

}
