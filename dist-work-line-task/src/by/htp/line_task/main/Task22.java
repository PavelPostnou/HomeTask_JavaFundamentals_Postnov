package by.htp.line_task.main;

/*22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int s;
		
		System.out.print("Введите время в секундах: ");
		s = sc.nextInt();
		
		int h;
		int m;
		
		h = s / 3600;
		m = (s % 3600) / 60;
		s = (s % 3600) % 60;
		
		System.out.print("Минское время " + h + "чч " + m + "мин " + s + "сс");

	}

}
