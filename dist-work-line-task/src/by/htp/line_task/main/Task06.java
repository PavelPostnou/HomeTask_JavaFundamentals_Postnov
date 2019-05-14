package by.htp.line_task.main;

//6. Ќаписать код дл€ решени€ задачи. ¬ n малых бидонах 80 л молока. —колько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
		
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n;
		double m;
		
		double kolmol;
		
		System.out.print("¬ведите количество малых бидонов: ");
		n = sc.nextDouble();
		System.out.print("¬ведите количество больших бидонов: ");
		m = sc.nextDouble();
		
		kolmol = (80 / n + 12) * m;

		System.out.print(" оличество молока в больших бидонах =  " + kolmol);
	}

}
