package by.htp.cycle_task.main;

/*24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по
сравнению с введенным числом.*/

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		int sum;
		
		sum = 0;
		
		
		int nn;
		
		nn = 0;
		
		System.out.print("Введите число: ");
		n = sc.nextInt();
		
		int temp;
		
		while (n > 0)
		{
			
			temp = n % 10;
		
			if (temp % 2 == 0)
			{
				sum = sum + temp;
				
			}
			
			nn = nn * 10 + temp;
			
			n = n / 10;
		
		}
		
		System.out.println("Сумма четных цифр числа равна = " + sum);
		System.out.println("Зеркальное число равно = "+ nn);

	}

}
