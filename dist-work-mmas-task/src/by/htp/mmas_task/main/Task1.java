package by.htp.mmas_task.main;

/*1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была
ровно одна единица, и вывести на экран.*/

public class Task1 {

	public static void main(String[] args) {
		
		int mas [][] = new int [3][4];
		int k = 0;
		
		for (int i = 0; i < mas.length; i ++)
		{
			k++;
			for (int j = 0; j < mas[i].length; j++)
			{
				mas[i][k]=1;
				System.out.print (mas [i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
