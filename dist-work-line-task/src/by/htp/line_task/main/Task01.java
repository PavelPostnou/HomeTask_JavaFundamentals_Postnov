package by.htp.line_task.main;

//1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		double result;
		
		System.out.print("Введите значение для x: ");
		x = sc.nextDouble();
		System.out.print("Введите значение для y: ");
		y = sc.nextDouble();
		
		result = x+y;
		System.out.println("Результат сложения = " + x + " + " + y + " = " + result);
		
		result = x-y;
		System.out.println("Результат вычитания = " + x + " - " + y + " = " + result);
		
		result = x*y;
		System.out.println("Результат умножения = " + x + " * " + y + " = " + result);
		
		result = x/y;
		System.out.print("Результат деления = " + x + " / " + y + " = " + result);
	}

}
