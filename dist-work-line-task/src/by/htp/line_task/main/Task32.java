package by.htp.line_task.main;

/*32. ������� ��������� ����������� �����: � � (�� 0 �� 23) � ��� (�� 0 �� 59) � � (�� 0 �� 59).
����� ����� ����� ���������� ���� ����� � � q ��� r �?*/
		
import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double m;
		double n;
		double k;
		double p;
		double q;
		double r;
		
		
		System.out.print("������� ������� ����� �. (�� 0 �� 23): ");
		m = sc.nextDouble();
		System.out.print("������� ������� ����� �. (�� 0 �� 59): ");
		n = sc.nextDouble();
		System.out.print("������� ������� ����� �. (�� 0 �� 59): ");
		k = sc.nextDouble();
		System.out.print("������� ��������� ����� �.: ");
		p = sc.nextDouble();
		System.out.print("������� ��������� ����� �.: ");
		q = sc.nextDouble();
		System.out.print("������� ������� ����� �.: ");
		r = sc.nextDouble();
		
		m = (int)(m + p + (n + q) / 60 + (k + r) / 60);
		n = (int)((n + q + (k + r) / 60) % 60);
		k = (k + r) % 60;
		
		System.out.print("������� �����: " + m + " � " + n + " ��� " + k + " �" );
		

	}

}
