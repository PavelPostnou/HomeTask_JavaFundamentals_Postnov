package by.htp.line_task.main;

//7. ��� �������������, ������ �������� � ��� ���� ������ �����. ����� ������� ��������������

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		int square;
		
		System.out.print("������� ������ ��������������: ");
		x = sc.nextInt();
		
		square = x * x * 2;
		
		System.out.print("������� �������������� ����� = " + square);
		
	}

}
