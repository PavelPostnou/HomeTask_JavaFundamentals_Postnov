package by.htp.line_task.main;

//29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

import java.util.Scanner;


public class Task29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double grad1;
		double rad1;
		double grad2;
		double rad2;
		double grad3;
		double rad3;

		System.out.print("Введите значение a: ");
		a = sc.nextDouble();
		System.out.print("Введите значение b: ");
		b = sc.nextDouble();
		System.out.print("Введите значение c: ");
		c = sc.nextDouble();
		
		rad1 = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		grad1 = rad1 * 180 / Math.PI;
		rad2 = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		grad2 = rad2 * 180 / Math.PI;
		grad3 = 180 - grad1 - grad2;
		rad3 = grad3 * Math.PI / 180;
		
		System.out.println("Углы треугольника равны " );
		System.out.println("угол1 = " + grad1 + " градусов" + " или " + rad1 + " радиан" );
		System.out.println("угол2 = " + grad2 + " градусов" + " или " + rad2 + " радиан" );
		System.out.println("угол3 = " + grad3 + " градусов" + " или " + rad3 + " радиан" );
		
		
	}

}
