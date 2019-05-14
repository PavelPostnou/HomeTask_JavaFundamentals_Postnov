package by.htp.cycle_task.main;

//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double n;
		
		System.out.print("Введите число n: ");
		n = sc.nextDouble();
		
		double sum = 0;;
		
		for (double x = 1; x<=n;x++)
		{
			sum = sum + 1/x;
		}
		
		System.out.print("Сумма значений равна = " + sum);
		

	}

}
