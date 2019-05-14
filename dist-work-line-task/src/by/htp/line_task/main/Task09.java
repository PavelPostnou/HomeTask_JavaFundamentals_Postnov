package by.htp.line_task.main;

//9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		
		double result;
		
		System.out.print("Введите значение для a: ");
		a = sc.nextDouble();
		System.out.print("Введите значение для b: ");
		b = sc.nextDouble();
		System.out.print("Введите значение для c: ");
		c = sc.nextDouble();
		System.out.print("Введите значение для d: ");
		d = sc.nextDouble();
		
		result = a / c * b / d - (a * b - c) / (c * d);
		
		System.out.print("Результат выражения равен =  " + result);


	}

}
