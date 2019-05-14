package by.htp.branch_task.main;

/*22. ѕерераспределить значени€ переменных х и у так, 
чтобы в х оказалось большее из этих значений, а в y - меньшее. */

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double x;
		double y;
		
		System.out.print("¬ведите значение дл€ x: ");
		x = sc.nextDouble();
		System.out.print("¬ведите значение дл€ y: ");
		y = sc.nextDouble();
		
		if (y>x)
		{
			double temp;
			
			temp = x;
			x = y; 
			y = temp;
		}

		System.out.print("x = " + x + " y = " + y);
	}

}
