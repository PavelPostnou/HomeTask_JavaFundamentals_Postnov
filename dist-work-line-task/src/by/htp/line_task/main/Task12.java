package by.htp.line_task.main;

//12. ¬ычислить рассто€ние между двум€ точками с данными координатами (х1, у1)и (x2, у2)

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1;
		double x2;
		double y1;
		double y2;
		
		double dist;
		
		System.out.print("¬ведите значение дл€ катета координаты x1: ");
		x1 = sc.nextDouble();
		System.out.print("¬ведите значение дл€ катета координаты y1: ");
		y1 = sc.nextDouble();
		System.out.print("¬ведите значение дл€ катета координаты x2: ");
		x2 = sc.nextDouble();
		System.out.print("¬ведите значение дл€ катета координаты y2: ");
		y2 = sc.nextDouble();
		
		dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.print("–ассто€ние между двум€ точками = " + dist);

	}

}
