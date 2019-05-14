package by.htp.branch_task.main;

//18. Подсчитать количество отрицательных среди чисел а, b, с.

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("Введите первое число: ");
		a = sc.nextInt();
		System.out.print("Введите второе число: ");
		b = sc.nextInt();
		System.out.print("Введите третье число: ");
		c = sc.nextInt();
		
		int count;
		count = 0;
		
		if (a < 0)
		{
			count ++;
		}
		
		if (b < 0) 
		{
			count ++;
		}
		
		if(c < 0)
		{
			count ++;
		}
		
		System.out.print("Количество отрицательных чисел равно = " + count);
		
		}
	}


