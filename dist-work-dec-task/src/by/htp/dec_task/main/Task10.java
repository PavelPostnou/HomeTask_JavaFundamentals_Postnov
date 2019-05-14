package by.htp.dec_task.main;

/*10. Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1
до 9.*/

public class Task10 {

	public static void main(String[] args) {
		
		Factorial();

	}

	public static void Factorial()
	{
		int sum;
		sum = 0;
		int f;
		f = 1;
		
		for (int x = 1 ; x <= 9; x=x+2)
		{
			for (int y = 1; y <= x; y++)
			{
				f = f * y;
			}
			sum = sum + f;
			f = 1;
		}
		
		System.out.print(sum);
	}
}
