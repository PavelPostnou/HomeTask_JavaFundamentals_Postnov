package by.htp.line_task.main;

//4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double z;
		
		System.out.print("Введите значение для a: ");
		a = sc.nextDouble();
		System.out.print("Введите значение для b: ");
		b = sc.nextDouble();
		System.out.print("Введите значение для c: ");
		c = sc.nextDouble();
		
		z = ( (a-3) * b / 2) + c;
		
		System.out.print("Значение функции z = " + z);


	}

}
