package by.htp.line_task.main;

/*31. —оставить программу дл€ вычислени€ пути, пройденного лодкой, если ее скорость в
сто€чей воде v км/ч, скорость течени€ реки v1 км/ч, врем€ движени€ по озеру t1 ч, а против
течени€ реки Ч t2 ч.*/

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double v;
		double v1;
		double t1;
		double t2;
		
		System.out.print("¬ведите скорость лодки км/ч: ");
		v = sc.nextDouble();
		System.out.print("¬ведите скорость течени€ реки км/ч: ");
		v1 = sc.nextDouble();
		System.out.print("¬ведите врем€ движени€ по озеру ч.: ");
		t1 = sc.nextDouble();
		System.out.print("¬ведите врем€ движени€ против течени€ ч.: ");
		t2 = sc.nextDouble();
		
		double dist;
		
		dist = v * t1 + (v-v1) * t2; 
		
		System.out.print("–ассто€ние, пройденное катером, равно = " + dist + " км");
		
		
		
	}

}
