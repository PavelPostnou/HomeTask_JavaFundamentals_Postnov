package by.htp.line_task.main;

//19. ���� ������� ��������������� ������������. ����� ������� ����� ������������, ��� ������, ������� ��������� � ��������� �����������.

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int st;
		
		System.out.print("������� ����� ������� ������������: ");
		st = sc.nextInt();
		
		double square;
		double h;
		double rvo;
		double roo;
		
		h = (st * Math.sqrt(3)) / 2;
		square = (st * h) / 2;
		rvo = st / (2 * Math.sqrt(3));
		roo = st / Math.sqrt(3);
		
		System.out.println("������ ������������ ����� = " + h);
		System.out.println("������� ������������ ����� = " + square);
		System.out.println("������ ��������� ���������� ����� = " + rvo);
		System.out.println("������ ��������� ���������� ����� = " + roo);
	}

}
