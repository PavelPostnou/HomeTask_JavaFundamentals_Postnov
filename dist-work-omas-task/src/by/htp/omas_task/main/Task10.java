package by.htp.omas_task.main;
/*10. Даны целые числа а1 ,а2 ,..., аn . 
Вывести на печать только те числа, для которых аi > i.*/

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int n;
		
		System.out.print("Введите размер массива: ");
		n = sc.nextInt();
		
		int a [] = new int [n];
		
		for (int i = 0; i < a.length; i++) {
		    a[i] = (int)((Math.random() * 100) - 50);
		    System.out.println(a[i]);
		}
		
		System.out.println("Числа, для которых a[i] > i");
		
		for (int i = 0; i < a.length; i++) {
		   if (a[i] > i)
		   {
			   System.out.println(a[i]);
		   }
		}

	}

}
