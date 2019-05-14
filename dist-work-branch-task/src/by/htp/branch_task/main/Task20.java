package by.htp.branch_task.main;

//20. ќпределить, делителем каких чисел а, b, с €вл€етс€ число k.

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double k;
		
		System.out.print("¬ведите значение дл€ a: ");
		a = sc.nextDouble();
		System.out.print("¬ведите значение дл€ b: ");
		b = sc.nextDouble();
		System.out.print("¬ведите значение дл€ c: ");
		c = sc.nextDouble();
		System.out.print("¬ведите значение дл€ k: ");
		k = sc.nextDouble();
		
		if (a % k == 0)
		{
			System.out.println(k + " €вл€етс€ делителем числа " + a);
		}
		
		if (b % k == 0) 
		{
			System.out.println(k +" €вл€етс€ делителем числа " + b);
			
		}
		
		if (c % k == 0) 
		{ 
			System.out.println(k +" €вл€етс€ делителем числа " + c);
		}
		
		else if (a % k != 0 && b % k != 0 && c % k != 0 )
		{
			System.out.println(" не €вл€етс€ делителем ни одного из приведЄнных чисел");
		}
	}

}
