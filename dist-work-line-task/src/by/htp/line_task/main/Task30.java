package by.htp.line_task.main;

/*30. ��� ������������� R1 R2, � R3 ��������� �����������. ������� �������������
����������.*/

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r1;
		double r2;
		double r3;
		
		System.out.print("������� �������� ������� �������������: ");
		r1 = sc.nextDouble();
		System.out.print("������� �������� ������� �������������: ");
		r2 = sc.nextDouble();
		System.out.print("������� �������� �������� �������������: ");
		r3 = sc.nextDouble();
		
		double r;
		
		r = 1 / (1 / r1 + 1 / r2 + 1 / r3);
		
		System.out.print("����� ������������� ���� ����� = " + r);
		
		
	}

}
