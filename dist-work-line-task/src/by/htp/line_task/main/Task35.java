package by.htp.line_task.main;

/*35. ���� ����������� ����� � � N. 
������� ������� ����� ������� ����� � ������� ����� ����� ����� ����� M/N.*/

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in);
		
		double m;
		double n;
		
		System.out.print("������� ����� M : ");
		m = sc.nextDouble();
		System.out.print("������� ����� N : ");
		n = sc.nextDouble();
		
		int mc;
		mc = (int)((m/n)%10);
		
		int sd;
		sd = (int)(((m / n) * 10) % 10);
		
		
		System.out.println("���������� ����� ����� = " + m/n);
		System.out.println("������� ����� ����� ����� ����� = " + mc);
		System.out.println("������� ����� ������� ����� ����� = " + sd);
	}

}
