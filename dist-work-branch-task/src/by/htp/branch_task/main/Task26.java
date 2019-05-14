package by.htp.branch_task.main;

/*26. Написать программу нахождения суммы большего
и меньшего из трех чисел.*/

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x1;
		int x2;
		int x3;
		
		int max = 0;
		int min = 0;
		System.out.print("Введите первое число: ");
		x1 = sc.nextInt();
		System.out.print("Введите второе число: ");
		x2 = sc.nextInt();
		System.out.print("Введите третье число: ");
		x3 = sc.nextInt();
		
		if (x1 >= x2 && x1 >= x3)
		{
			max = x1;
		}
		else if (x2 >= x1 && x2 >= x3)
		{
			max = x2;
		}
		else if (x3 >= x1 && x3 >= x2)
		{
			max = x3;
		}
		
		
		if (x1 <= x2 && x1 <= x3)
		{
			min = x1;
		}
		else if (x2 <= x1 && x2 <= x3)
		{
			min = x2;
		}
		else if (x3 <= x1 && x3 <= x2)
		{
			min = x3;
		}
		
		
		int sum;
		
		sum = max + min;
		
		System.out.print("Сумма большего и меньшего из трёх чисел равна = " + sum);
	}

}
