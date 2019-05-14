package by.htp.cycle_task.main;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in);
		 
	        int n;
	        
	        System.out.println("Начало вычислений: ");
	       
	        n = 1;
	 
	        while (n != 0)
	        {
	        	System.out.print("Введите знак операции: ");
	 	        char sign = sc.next().charAt(0);
	 	        
	 	        if (sign != '/' && sign != '*' && sign != '+' && sign != '-') 
	 	        {
	                 System.out.println("Неправильный знак!");
	            }
	 	        
	            System.out.print("Введите первое число: ");
	            int x = sc.nextInt();
	 
	            System.out.print("Введите второе число: ");
	            int y = sc.nextInt();
	 
	            if (sign == '+') {
	                int result = x + y;
	                System.out.println("Result: " + result);
	            } else if (sign == '-') {
	                int result = x - y;
	                System.out.println("Result: " + result);
	            } else if (sign == '*') {
	                int result = x * y;
	                System.out.println("Result: " + result);
	            } else if (sign == '/') {
	                int result = x / y;
	                System.out.println("Result: " + result);
	            } else if (sign == '/' && y == 0) {
	                System.out.println("На ноль делить нельзя");
	 
	            }
	            
	            System.out.println("Продолжить? 1 - да 0 - закончить");
		        n = sc.nextInt();
	            if (n == '0') {
	                break;
	            }
	 
	        }
	 
	}
	    }
	


