package by.htp.line_task.main;

//10. ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������):
	
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		double result;
		
		System.out.print("������� �������� ��� x: ");
		x = sc.nextDouble();
		System.out.print("������� �������� ��� y: ");
		y = sc.nextDouble();

		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
		
		System.out.print("��������� ��������� ����� = " + result);
	}

}
