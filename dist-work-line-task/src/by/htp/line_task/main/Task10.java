package by.htp.line_task.main;

//10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		double result;
		
		System.out.print("Введите значение для x: ");
		x = sc.nextDouble();
		System.out.print("Введите значение для y: ");
		y = sc.nextDouble();

		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
		
		System.out.print("Результат выражения равен = " + result);
	}

}
