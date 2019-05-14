package by.htp.line_task.main;

/*26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими
сторонами у.*/

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double y;
		
		double sq;
		
		System.out.print("Введите значение a: ");
		a = sc.nextDouble();
		System.out.print("Введите значение b: ");
		b = sc.nextDouble();
		System.out.print("Введите значение y: ");
		y = sc.nextDouble();
		
		sq = (a * b * Math.sin(y)) / 2;
		
		System.out.print("Площадь треугольника равна = " + sq);
		
		

	}

}
