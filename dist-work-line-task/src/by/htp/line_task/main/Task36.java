package by.htp.line_task.main;

//36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

import java.util.Scanner;

public class Task36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
		double n;
		
		System.out.print(" Введите четырехзначное число: ");
		n = sc.nextDouble();
		
		int ch1;
		int ch2;
		int nech1;
		int nech2;
		
		nech1 = (int) (n % 10);
		ch2 =(int) (n / 1000);
		ch1 = (int)((n%100)/10);
		nech2 = (int)((n % 1000)/100);
		
		double rez;
		
		rez = (double)(ch1 * ch2) / (nech1 * nech2);
		
		System.out.println("Результат = " + rez);

	}

}
