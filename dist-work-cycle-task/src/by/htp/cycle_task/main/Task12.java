package by.htp.cycle_task.main;

/*12. ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n >1 ���������
��������� ���������� ������������ ������ 10 ������ ���� ������������������.*/

public class Task12 {

	public static void main(String[] args) {
	
		int a = 1;
		int n;
		int p=1;
		
		for (n = 2; n<=10;n++)
		{
			p = a;
			a = (6 + a);
			p = a * p;
		}
		
		System.out.println(p);
	}

}
