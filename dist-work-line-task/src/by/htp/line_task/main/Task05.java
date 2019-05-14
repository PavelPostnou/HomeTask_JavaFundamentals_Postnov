package by.htp.line_task.main;

//5. Составить алгоритм нахождения среднего арифметического двух чисел

import java.util.Scanner;


public class Task05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		
		double result;
		
		System.out.print("Введите значение для первого числа: ");
		a = sc.nextDouble();
		System.out.print("Введите значение для второго числа: ");
		b = sc.nextDouble();
		
		result = (a + b) / 2;
		
		System.out.print("Среднее арифметическое данных чисел будет =  " + result);
		
	}

}
