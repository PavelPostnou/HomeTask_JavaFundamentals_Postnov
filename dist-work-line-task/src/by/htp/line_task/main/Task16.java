package by.htp.line_task.main;

//16. Найти произведение цифр заданного четырехзначного числа.

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int d;
		
		System.out.print("Введите четырёхзначное число: ");
		d = sc.nextInt();
		
		int on;
		int sn;
		int tn;
		int fn;
		
		on = d%10;
		d = d/10;
		sn = d%10;
		d = d/10;
		tn = d%10;
		d = d/10;
		fn = d%10;
		
		int p = on*sn*tn*fn;
		
		
		System.out.println("Произведение цифр равно = " + p);
	
		

	}

}
