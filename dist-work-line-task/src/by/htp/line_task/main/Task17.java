package by.htp.line_task.main;

//17. ���� ��� �����. ����� ������� �������������� ����� ���� ����� � ������� �������������� ������� ���� �����.

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double f;
		double s;
		
		System.out.print("������� ������ �����: ");
		f = sc.nextDouble();
		System.out.print("������� ������ �����: ");
		s = sc.nextDouble();
		
		double sa;
		double sg;
		
		sa = (Math.pow(f, 3) + Math.pow(s,3))/2;
		sg = Math.sqrt(Math.abs(f) * Math.abs(s));
		
		System.out.println("������� �������������� ����� ������ ����� ����� = " + sa);
		System.out.println("������� �������������� ������� ������ ����� ����� = " + sg);
	}

}