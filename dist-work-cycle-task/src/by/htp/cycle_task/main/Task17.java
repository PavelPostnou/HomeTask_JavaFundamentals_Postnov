package by.htp.cycle_task.main;

//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

import java.util.Scanner;


public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a;
		int n;
		
		System.out.println("Введите значение а: ");
		a = sc.nextDouble();
		System.out.println("Введите значение n: ");
		n = sc.nextInt();
		
		double p;
		p = a;
		
		for (int x = 1; x < n; x++)
		{
			
		p = p * (a + x);
		
		}
		
		System.out.println("Произведение равно = " + p);
	}

}
