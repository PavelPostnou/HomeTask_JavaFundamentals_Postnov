package by.htp.branch_task.main;

/*23. ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12).
≈сли введены некорректные данные, то сообщить об этом.*/

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int month;
		int date;
		
		System.out.print("¬ведите число мес€ца: ");
		date = sc.nextInt();
		
		if (date < 1 || date > 31)
		{
			System.out.println ("¬ы ввели некорректные данные");
		}
		
		System.out.print("¬ведите номер мес€ца: ");
		month = sc.nextInt();
		
		if (month < 1 || date > 31)
		{
			System.out.println (" ¬ы ввели некорректные данные");
		}


	}

}
