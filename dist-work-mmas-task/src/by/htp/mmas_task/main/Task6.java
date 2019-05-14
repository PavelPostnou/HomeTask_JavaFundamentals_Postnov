package by.htp.mmas_task.main;

/*6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
больше последнего.*/

public class Task6 {

	public static void main(String[] args) {
		
		int n;
		int m;
		
		n=4;
		m=4;
		
		int mas [][] = new int [4][4];
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				mas [i][j] = (int)(1 + (Math.round(Math.random() * (9 - 1))));
				
				System.out.print (mas [i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		System.out.println ("Столбцы, у которых первый элемент больше последнего.");
		for (int j = 0; j < m; j++)
		{
		if (mas [0][j] > mas [mas.length-1][j] )
		{
				for (int i = 0 ; i < m; i++)
				{
					System.out.println (mas [i][j] + " ");
					
				}
				
		}
		}
		}
	}

