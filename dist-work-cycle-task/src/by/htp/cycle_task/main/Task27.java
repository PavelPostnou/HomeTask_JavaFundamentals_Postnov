package by.htp.cycle_task.main;

/*27. ƒл€ каждого натурального числа в промежутке от m до n вывести все делители, кроме
единицы и самого числа. m и n ввод€тс€ с клавиатуры.*/

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		int m;

		System.out.print("¬ведите первое число: ");
		n = sc.nextInt();
		System.out.print("¬ведите второе число: ");
		m = sc.nextInt();
		
		for (int x = n; x <= m; x++)
		{
			System.out.print("„исло " + x + " делитс€ на: ");
			for (int y = 2; y <= x-1; y ++)
			{
				
			if (x % y == 0)
			{
				System.out.print(y + ", ");
				
			}
				
			}
			System.out.println();
		}
	}

}
