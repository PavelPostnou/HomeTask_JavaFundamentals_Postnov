package by.htp.line_task.main;

/*32. Текущее показание электронных часов: т ч (от 0 до 23) п мин (от 0 до 59) к с (от 0 до 59).
Какое время будут показывать часы через р ч q мин r с?*/
		
import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double m;
		double n;
		double k;
		double p;
		double q;
		double r;
		
		
		System.out.print("Введите текущее время ч. (от 0 до 23): ");
		m = sc.nextDouble();
		System.out.print("Введите текущее время м. (от 0 до 59): ");
		n = sc.nextDouble();
		System.out.print("Введите текущее время с. (от 0 до 59): ");
		k = sc.nextDouble();
		System.out.print("Введите прошедшее время ч.: ");
		p = sc.nextDouble();
		System.out.print("Введите прошедшее время м.: ");
		q = sc.nextDouble();
		System.out.print("Введите текущее время с.: ");
		r = sc.nextDouble();
		
		m = (int)(m + p + (n + q) / 60 + (k + r) / 60);
		n = (int)((n + q + (k + r) / 60) % 60);
		k = (k + r) % 60;
		
		System.out.print("Текущее время: " + m + " ч " + n + " мин " + k + " с" );
		

	}

}
