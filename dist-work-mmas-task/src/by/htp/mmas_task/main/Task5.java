package by.htp.mmas_task.main;

/*5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.*/

public class Task5 {

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
		
		System.out.println ("Чётные строки");
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				if (i % 2 != 0)
				{
					System.out.print (mas [i][j] + " ");
				}
				
			}
			if (i % 2 != 0)
			{
			System.out.println();
			}
		}
	}

}
