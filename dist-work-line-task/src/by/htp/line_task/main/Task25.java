package by.htp.line_task.main;

/*25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами
a, b и с (предполагается, что а!=0 и что дискриминант уравнения неотрицателен).*/

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		
		double D;
		
		System.out.print("Введите значение a: ");
		a = sc.nextDouble();
		System.out.print("Введите значение b: ");
		b = sc.nextDouble();
		System.out.print("Введите значение c: ");
		c = sc.nextDouble();
		
		D = Math.pow(b,2) - 4 * a * c;
		
		double x1;
		double x2;
		
		x1 = (-b - Math.sqrt(D)) / (2 * a);
		x2 = (-b + Math.sqrt(D)) / (2 * a);
		
		System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
	}

}
