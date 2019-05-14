package by.htp.omas_task.main;

/*20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него
каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
Дополнительный массив не использовать.
*/

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int n;
		int k=1;
		int l;
		
		System.out.print("Введите размер массива: ");
		n = sc.nextInt();
		
		int a [] = new int [n];
		
		for (int i = 0; i < a.length; i++) {
		    a[i] =(int)((Math.random() * 100) - 50);
		    System.out.println(a[i]);
		}
		
		if (a.length % 2 == 0)
		{
			l = a.length / 2;
		}
		else
		{
			l = (a.length / 2) + 1;
		}
		
		for (int i = 1; i < l; i++) {
			
			a[i] = a [i+k];
			k++;
			
		}
		
		for (int i = l; i < a.length; i++) {
			
			a[i] = 0;
			
		}
		
		System.out.println("-----------------");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		}
		

	}

