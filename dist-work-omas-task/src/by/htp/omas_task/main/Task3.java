package by.htp.omas_task.main;

/*3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается
раньше - положительное или отрицательное.*/

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("Введите размер массива: ");
		n = sc.nextInt();
		
		int a [] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
		    a[i] = (int)((Math.random() * 100) - 50);
		    System.out.println(a[i]);
		}
		
		if (a[0] < 0)
		{
			System.out.println("Первое число отрицательное: " + a[0]);
		}
		if (a[0] >= 0)
		{
			System.out.println("Первое число положительное: " + a[0]);
		}


	}

}
