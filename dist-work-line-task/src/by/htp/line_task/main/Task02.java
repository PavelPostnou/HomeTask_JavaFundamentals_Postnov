package by.htp.line_task.main;

//2. Найдите значение функции: с = 3 + а.

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int c;
		
		System.out.print("Введите значение a: ");
		a = sc.nextInt();
		
		c = 3 + a;
		
		System.out.print("Значение функции =  " + "3" + " + "+ a + " = " + c);
	

	}

}
