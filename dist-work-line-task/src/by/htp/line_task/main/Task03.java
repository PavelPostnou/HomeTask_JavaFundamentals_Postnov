package by.htp.line_task.main;

//3. ������� �������� �������: z = 2 * x + ( y � 2 ) * 5.

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int x;
		int y;
		int z;
		
		System.out.print("������� �������� ��� x: ");
		x = sc.nextInt();
		System.out.print("������� �������� ��� y: ");
		y = sc.nextInt();
		
		z = 2 * x + (y-2) * 5;
		
		System.out.print("�������� ������� z = " + z);

	}

}
