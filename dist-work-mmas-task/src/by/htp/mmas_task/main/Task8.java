package by.htp.mmas_task.main;

/*8. ��� ���������� ������ n�m ���������. ����������, ������� ��� ����������� �����
7 ����� ��������� �������.*/

public class Task8 {

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

		int sum = 0;
		
		for (int i = 0; i < mas.length; i ++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				if (mas[i][j] == 7)
				{
					sum++;
				}
				
			}
			
		}
		System.out.println("����� 7 ����������� " + sum + " ���");

	}

}
