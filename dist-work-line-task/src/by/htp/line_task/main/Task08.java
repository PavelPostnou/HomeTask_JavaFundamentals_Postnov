package by.htp.line_task.main;

//8. ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������): 

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double result;
		
		System.out.print("������� �������� ��� a: ");
		a = sc.nextDouble();
		System.out.print("������� �������� ��� b: ");
		b = sc.nextDouble();
		System.out.print("������� �������� ��� c: ");
		c = sc.nextDouble();
		
		result = (b + Math.sqrt (Math.pow (b , 2) + 4 * a * c) ) / (2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
		
		System.out.print("��������� ��������� ����� =  " + result);

	}

}
