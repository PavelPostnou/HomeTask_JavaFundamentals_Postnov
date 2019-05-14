package by.htp.cycle_task.main;

/*12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте
программу нахождения произведения первых 10 членов этой последовательности.*/

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
