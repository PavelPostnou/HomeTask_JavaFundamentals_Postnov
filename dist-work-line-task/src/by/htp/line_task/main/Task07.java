package by.htp.line_task.main;

//7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		int square;
		
		System.out.print("Введите ширину прямоугольника: ");
		x = sc.nextInt();
		
		square = x * x * 2;
		
		System.out.print("Площадь прямоугольника равна = " + square);
		
	}

}
