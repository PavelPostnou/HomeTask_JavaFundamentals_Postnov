package by.htp.line_task.main;

import java.io.IOException;

/*33. ������ ����� ������ � ���������� ��� ���������� �����, � ����� ������� ����������
� ����������� �������.*/

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) throws IOException {
		
		char c;
		char c1;
		char c2;
		System.out.print("������� ������: ");
		c = (char) System.in.read();
		
		int n;
		n = (int) c;
		
		c1 = (char)(n-1);
		c2 = (char)(n+1);
		
		System.out.println("���������� ����� ��������� ������� = " + n);
		System.out.println("���������� ������ = " + c1);
		System.out.println("��������� ������ = " + c2);
	}

}
