package by.htp.line_task.main;

//6. �������� ��� ��� ������� ������. � n ����� ������� 80 � ������. ������� ������ ������ � m ������� �������, ���� � ������ ������� ������ �� 12 �. ������, ��� � �����?
		
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n;
		double m;
		
		double kolmol;
		
		System.out.print("������� ���������� ����� �������: ");
		n = sc.nextDouble();
		System.out.print("������� ���������� ������� �������: ");
		m = sc.nextDouble();
		
		kolmol = (80 / n + 12) * m;

		System.out.print("���������� ������ � ������� ������� =  " + kolmol);
	}

}
