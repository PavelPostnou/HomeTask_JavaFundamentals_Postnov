package by.htp.cycle_task.main;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
больше или равен заданному е. Общий член ряда имеет вид:an = (-1)n-1 / n */

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double e;
		double a;
		int n;
		
		System.out.print("Введите значение е: ");
		e = sc.nextDouble();
		System.out.print("Введите значение n: ");
		n = sc.nextInt();
		
		double sum = 0;
		
		for (int x = 1; x <= n; x++)
		{
			a = Math.pow(-1,x-1)/x;
			
			if (Math.abs(a)>=e)
			{
				sum = sum + a;
			}
		}
			
		System.out.print("Сумма членов ряда равна = " + sum);
		

	}

}
