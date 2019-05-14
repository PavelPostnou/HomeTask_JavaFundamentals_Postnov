package by.htp.line_task.main;

/*27. Дано значение a. Не используя никаких функций и никаких операций, кроме
умножения, получить значение а8 за три операции и а10 за четыре операции.*/

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		System.out.print("Введите значение a: ");
		a = sc.nextDouble();
		
		double temp;
		
		temp = a * a;
		a = temp * temp;
		a = a * a;
		
		System.out.println("a в восьмой степени равно = " + a);
		
		a = temp * a;
		
		System.out.println("a в десятой степени равно = " + a);
		
		
		
		
		

	}

}
