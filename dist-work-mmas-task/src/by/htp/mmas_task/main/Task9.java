package by.htp.mmas_task.main;

/*9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

public class Task9 {

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
				mas [i][j] = (int)(Math.random() * 15 - 5);
				
				System.out.print (mas [i][j] + " | ");
				
			}
			System.out.println();
		}
		
		int l = 0;
		
		System.out.println("Элементы, стоящие по диагонали: ");
		
		for (int i = 0; i < mas.length; i ++)
		{
				System.out.print (mas [i][l] + " | ");
				l++;
				
			}
			
		}
		

	}


