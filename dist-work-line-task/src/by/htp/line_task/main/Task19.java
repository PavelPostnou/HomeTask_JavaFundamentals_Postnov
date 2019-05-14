package by.htp.line_task.main;

//19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int st;
		
		System.out.print("Введите длину стороны треугольника: ");
		st = sc.nextInt();
		
		double square;
		double h;
		double rvo;
		double roo;
		
		h = (st * Math.sqrt(3)) / 2;
		square = (st * h) / 2;
		rvo = st / (2 * Math.sqrt(3));
		roo = st / Math.sqrt(3);
		
		System.out.println("Высота треугольника равна = " + h);
		System.out.println("Площадь треугольника равна = " + square);
		System.out.println("Радиус вписанной окружности равен = " + rvo);
		System.out.println("Радиус описанной окружности равен = " + roo);
	}

}
