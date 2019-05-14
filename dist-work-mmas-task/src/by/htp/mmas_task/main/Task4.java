package by.htp.mmas_task.main;

/*4. Дана матрица. Вывести на экран первую и последнюю строки.*/

public class Task4 {

	public static void main(String[] args) {
		
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
		
		System.out.println ("Первая и последяя строка: ");
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				if (i == 0 || i == mas.length-1)
				{
					System.out.print (mas [i][j] + " ");
				}
				
			}
			if (i == 0 || i == mas.length-1)
			{
			System.out.println();
			}
	
		}

	}

}
