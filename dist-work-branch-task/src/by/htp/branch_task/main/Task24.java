package by.htp.branch_task.main;

/*24. Составить программу, определяющую результат гадания на ромашке — 
«любит—не любит», взяв за исходное данное количество лепестков п.*/

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		
		System.out.print("Введите количество лепестков: ");
		count = sc.nextInt();
		
		if (count % 2 == 0) 
		{
		System.out.println("Не любит");	
		}
		else 
		System.out.println("Любит");	
		
	}

}
