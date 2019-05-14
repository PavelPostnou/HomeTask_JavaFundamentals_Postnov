package by.htp.dec_task.main;

/*3. Написать метод(методы) для нахождения наибольшего общего делителя четырех
натуральных чисел.*/

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		int y;
		int z;
		int o;
		
		System.out.print("Введите первое число: ");
		x = sc.nextInt();
		System.out.print("Введите второе число: ");
		y = sc.nextInt();
		System.out.print("Введите третье число: ");
		z = sc.nextInt();
		System.out.print("Введите четвёртое число: ");
		o = sc.nextInt();
		
		Devider (x, y, z, o);
		

	}
	
	public static void Devider ( int x, int y, int z, int o)
	{
		int nod;
		int temp;
		int y1;
		int z1;
		
		y1 = y;
		z1 = z;
		
		while (x != 0 && y != 0)
		{
			
		if (x > y)
		{
			x = x % y;
		}
		
		else 
		{
			y = y % x; 
		}
		}
		temp = x + y;
		nod = temp;
		
		while (z != 0 && o != 0)
		{
			
		if (z > o)
		{
			z = z % o;
		}
		
		else 
		{
			o = o % z; 
		}
		}
		temp = o + z ;
		if (temp < nod)
		{
		nod = temp;
		}
		
		while (y1 != 0 && z1 != 0)
		{
			
		if (y1 > z1)
		{
			y1 = y1 % z1;
		}
		
		else 
		{
			z1 = z1 % y1; 
		}
		}
		temp = y1 + z1;
		if (temp < nod)
		{
		nod = temp;
		}
		System.out.print (nod);
		
	}

}
