package by.htp.line_task.main;

//18. ���� ����� ����� ����. ����� ������� �����, ������� ������ ����������� � ����� ����� ����.

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int l;
		
		System.out.print("������� ����� ����: ");
		l = sc.nextInt();
		
		int sg;
		int sp;
		int ok;
		
		sg = l * l;
		sp = sg * 6;
		ok = (int) Math.pow(l, 3);
		
		System.out.println("������� ����� ���� ����� = " + sg);
		System.out.println("������� ������ ����������� ���� ����� = " + sp);
		System.out.println("����� ���� ����� = " + ok);
	}

}
