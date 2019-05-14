package by.htp.branch_task.main;

/*Написать программу, которая по паролю будет определять 
уровень доступа сотрудника к секретной информации в базе данных.
Доступ к базе имеют только шесть человек, разбитых на три группы
по степени доступа. Они имеют следующие пароли:
9583, 1747 — доступны модули баз А, В, С;
3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.*/

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		
		System.out.print("Введите пароль: ");
		x = sc.nextInt();
		
		if (x == 9583 || x == 1747)
		{
			System.out.print("Вам доступны модули баз A,B,C");
		}
		
		else if (x == 3331 || x == 7922)
		{
			System.out.print("Вам доступны модули баз B,C");
		}
		
		else if (x == 9455 || x == 8997)
		{
			System.out.print("Вам доступен модуль базы C");
		}
		
		else
		{
				System.out.print("Введён неверный пароль");
		}
	}

}
