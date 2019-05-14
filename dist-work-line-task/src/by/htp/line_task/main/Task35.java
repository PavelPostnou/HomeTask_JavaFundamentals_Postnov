package by.htp.line_task.main;

/*35. Даны натуральные числа М и N. 
Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.*/

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in);
		
		double m;
		double n;
		
		System.out.print("Введите число M : ");
		m = sc.nextDouble();
		System.out.print("Введите число N : ");
		n = sc.nextDouble();
		
		int mc;
		mc = (int)((m/n)%10);
		
		int sd;
		sd = (int)(((m / n) * 10) % 10);
		
		
		System.out.println("Полученное число равно = " + m/n);
		System.out.println("Младшая цифра целой части равна = " + mc);
		System.out.println("Старшая цифра дробной части равна = " + sd);
	}

}
