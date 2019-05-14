package by.htp.branch_task.main;

//Вычислить значение функции:
	
import java.util.Scanner;

public class Task40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x;
		
		System.out.print("Введите значение x: ");
		x = sc.nextDouble();
		
		double fx;
		fx = 0;
		
		if (x <= 13)
		{
			fx = Math.pow(-x,3)+9;
		}
		
		else if ( x > 13)
		{
			fx = -3/(x+1);
		}
		
		System.out.print("Значение функции F(x) равно = " + fx);
		
	}

}
