package by.htp.line_task.main;

//20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double length;
		
		System.out.print("Введите длину окружности: ");
		length = sc.nextDouble();
		
		double square;
		
		square = Math.pow(length, 2) / (4 * Math.PI);
		
		System.out.print("Площадь круга равна = " + square);
	}

}
