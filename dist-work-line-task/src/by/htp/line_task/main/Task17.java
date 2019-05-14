package by.htp.line_task.main;

//17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double f;
		double s;
		
		System.out.print("Введите первое число: ");
		f = sc.nextDouble();
		System.out.print("Введите второе число: ");
		s = sc.nextDouble();
		
		double sa;
		double sg;
		
		sa = (Math.pow(f, 3) + Math.pow(s,3))/2;
		sg = Math.sqrt(Math.abs(f) * Math.abs(s));
		
		System.out.println("Среднее арифметическое кубов данных чисел равно = " + sa);
		System.out.println("Среднее геометрическое модулей данных чисел равно = " + sg);
	}

}