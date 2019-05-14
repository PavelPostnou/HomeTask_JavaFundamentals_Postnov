package by.htp.line_task.main;

//11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		
		double square;
		double perimetr;
		
		System.out.print("Введите значение для катета a: ");
		a = sc.nextDouble();
		System.out.print("Введите значение для катета b: ");
		b = sc.nextDouble();
		
		square = (a + b) / 2;
		perimetr = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
		
		System.out.println("Площадь треугольника равна = " + square);
		System.out.println("Периметр треугольника равен = " + perimetr);
		
	}

}
