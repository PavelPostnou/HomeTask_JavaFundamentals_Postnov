package by.htp.mmas_task.main;

/*7. Дан двухмерный массив 5x5. Найти сумму модулей отрицательных нечетных
элементов.*/

public class Task7 {

	public static void main(String[] args) {
		

		int n;
		int m;
		
		n=5;
		m=5;
		
		int mas [][] = new int [n][m];
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				mas [i][j] = (int)(Math.random() * 10 - 5);
				
				System.out.print (mas [i][j] + " | ");
				
			}
			System.out.println();
		}

		int sum = 0;
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				if (j % 2 !=0 && mas[i][j] < 0)
				{
					sum = sum + Math.abs(mas [i][j]);
				}
				
			}
			
		}
		System.out.println("Сумма модулей равна = " + sum);
	}

}
