package by.htp.mmas_task.main;

/*2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0,
9].*/

public class Task2 {

	public static void main(String[] args) {

		int mas [][] = new int [2][3];
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				mas [i][j] = (int)(1 + (Math.round(Math.random() * (9 - 1))));
				
				System.out.print (mas [i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
