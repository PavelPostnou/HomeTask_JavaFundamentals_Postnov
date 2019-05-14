package by.htp.line_task.main;

//24. Найти площадь равнобедренной трапеции с основаниями а и b и углом a при большем основании a.

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double ang;
		
		System.out.print("Введите длину большего основания: ");
		a = sc.nextDouble();
		System.out.print("Введите длину меньшего основания: ");
		b = sc.nextDouble();
		System.out.print("Введите угол < 90: ");
		ang = sc.nextDouble();
		
		double sq;
		
		sq = (a*b) / Math.abs(Math.sin(ang));
		
		System.out.print("Площадь трапеции равна = " + sq);
	}

}
