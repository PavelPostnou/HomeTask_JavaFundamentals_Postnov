package by.htp.line_task.main;

//21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double d;
		int f;
		double k;
		
		System.out.print("Введите число вида nnn,mmm: ");
		d = sc.nextDouble();
		
		f = (int)d;
		k = f;
		d = (d % 1) * 1000 ;
		d = d + k / 1000;
		d = Math.round(d * 1000.0) / 1000.0;
		System.out.print(d);
		
	}

}
