package by.htp.omas_task.main;

/*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
данному К.*/

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		int k;
		int sum;
		sum = 0;
		
		System.out.print("Введите размер массива: ");
		n = sc.nextInt();
		System.out.print("Введите число кратности: ");
		k = sc.nextInt();
		
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
		    a[i] = (int)(Math.random() * 100);
		    System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
		    if (a[i]%k == 0)
		    {
		    	sum = sum + a[i];
		    }
		}

		System.out.print(sum);
	}

}
