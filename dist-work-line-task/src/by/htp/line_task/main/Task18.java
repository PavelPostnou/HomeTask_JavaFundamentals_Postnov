package by.htp.line_task.main;

//18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int l;
		
		System.out.print("Введите длину куба: ");
		l = sc.nextInt();
		
		int sg;
		int sp;
		int ok;
		
		sg = l * l;
		sp = sg * 6;
		ok = (int) Math.pow(l, 3);
		
		System.out.println("Площадь грани куба равна = " + sg);
		System.out.println("Площадь полной поверхности куба равна = " + sp);
		System.out.println("Объём куба равен = " + ok);
	}

}
