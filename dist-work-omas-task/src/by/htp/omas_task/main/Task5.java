package by.htp.omas_task.main;

/*5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.*/

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		int k;
		
		k = 0;
		System.out.print("Введите размер массива: ");
		n = sc.nextInt();
		
		
		int a [] = new int [n];
		
		
		
		for (int i = 0; i < a.length; i++) {
		    a[i] = (int)((Math.random() * 100) - 50);
		    System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a [i] % 2 == 0)
			{
				k++;
			}
		   }
		
		if (k == 0)
		{
			System.out.print("В данной последовательности нет чётных чисел");
		}
		
		else {
			int b [] = new int [k];
			int l = 0;
			
			for (int i = 0; i < a.length; i++) {
				if (a [i] % 2 == 0)
				{
					b[l] = a [i];
					l++;
				}
			
		}
		
			System.out.println("Полученный массив: ");
			
			for (int i = 0; i < b.length; i++) {
				
				System.out.println(b[i]);
				
				}
		}
	
	}
}
