package by.htp.line_task.main;

/*22. ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:
��� ����� SSc.*/

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int s;
		
		System.out.print("������� ����� � ��������: ");
		s = sc.nextInt();
		
		int h;
		int m;
		
		h = s / 3600;
		m = (s % 3600) / 60;
		s = (s % 3600) % 60;
		
		System.out.print("������� ����� " + h + "�� " + m + "��� " + s + "��");

	}

}
