package by.htp.cycle_task.main;

//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

import java.util.Scanner;

public class Task16 {

	
	public static void main(String[] args) {
		
		int x = 1;
		double p = 1;
		
		for (int i = 2; i <=10; i++)
		{
			
			x = (x+i);
			p = p*x;
			
		}
		
		System.out.print("Произведение равно = " + p);

	}

}
