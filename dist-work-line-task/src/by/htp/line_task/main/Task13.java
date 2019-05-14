package by.htp.line_task.main;

//13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		double perimetr;
		double square;
		
		System.out.print("Введите значение для катета координаты x1: ");
		x1 = sc.nextDouble();
		System.out.print("Введите значение для катета координаты y1: ");
		y1 = sc.nextDouble();
		System.out.print("Введите значение для катета координаты x2: ");
		x2 = sc.nextDouble();
		System.out.print("Введите значение для катета координаты y2: ");
		y2 = sc.nextDouble();
		System.out.print("Введите значение для катета координаты x2: ");
		x3 = sc.nextDouble();
		System.out.print("Введите значение для катета координаты y2: ");
		y3 = sc.nextDouble();
		
		double one = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
		double two = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3 - y2, 2));
		double three = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3 - y1, 2));
		
		perimetr = one + two + three;
		
		double polperimetr = perimetr/2;
		
		square = Math.sqrt(polperimetr * (polperimetr - one) * (polperimetr - two) * (polperimetr - three));
				
		System.out.println("Периметр заданного треуглольника равен = " + perimetr);
		System.out.println("Площадь заданного треуглольника равна = " + square);
	}

}
