package by.htp.line_task.main;

/*34. Дана величина А, выражающая объем информации в байтах.
Перевести А в более крупные единицы измерения информации.*/

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double kb;
		double mb;
		double gb;
		
		System.out.print("Введите объем информации в байтах: ");
		a = sc.nextDouble();
		
		kb = a / 1000;
		mb = kb / 1000;
		gb = mb / 1000;
		
		System.out.println("Объем информации в байтах равен = " + a);
		System.out.println("Объем информации в килобайтах равен = " + kb);
		System.out.println("Объем информации в мегабайтах равен = " + mb);
		System.out.println("Объем информации в гигабайтах равен = " + gb);
	}

}
