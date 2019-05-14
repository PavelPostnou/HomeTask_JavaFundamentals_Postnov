package by.htp.cycle_task.main;

/*21. —оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с шагом
h. –езультат представить в виде таблицы, первый столбец которой Ц значени€ аргумента,
второй - соответствующие значени€ функции:
F(x) = x - sin(x)*/

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double h;
		
		System.out.print("¬ведите значение a: ");
		a = sc.nextDouble();
		System.out.print("¬ведите значение b: ");
		b = sc.nextDouble();
		System.out.print("¬ведите шаг h: ");
		h = sc.nextDouble();
	
		double fx;
		
		for (double x = a; x <= b; x = x + h)
		{
			fx = x - Math.asin(x);
			
			System.out.println("|x = " + x + "|fx = " + fx + "|");
		}
	}

}
