package by.htp.line_task.main;

//23. Ќайти площадь кольца, внутренний радиус которого равен r, а внешний Ч R (R> r).

import java.util.Scanner;


public class Task23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double vnesh;
		double vnutr;
		
		System.out.print("¬ведите внешний радиус кольца: ");
		vnesh = sc.nextDouble();
		System.out.print("¬ведите внутренний радиус кольца: ");
		vnutr = sc.nextDouble();

		double square;
		
		square = Math.PI*(Math.pow(vnesh, 2) - Math.pow(vnutr, 2));

		System.out.print("ѕлощадь кольца равна = " + square);
	}

}
