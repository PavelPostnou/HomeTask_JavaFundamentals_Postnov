package by.htp.cycle_task.main;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in);
		 
	        int n;
	        
	        System.out.println("������ ����������: ");
	       
	        n = 1;
	 
	        while (n != 0)
	        {
	        	System.out.print("������� ���� ��������: ");
	 	        char sign = sc.next().charAt(0);
	 	        
	 	        if (sign != '/' && sign != '*' && sign != '+' && sign != '-') 
	 	        {
	                 System.out.println("������������ ����!");
	            }
	 	        
	            System.out.print("������� ������ �����: ");
	            int x = sc.nextInt();
	 
	            System.out.print("������� ������ �����: ");
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
	                System.out.println("�� ���� ������ ������");
	 
	            }
	            
	            System.out.println("����������? 1 - �� 0 - ���������");
		        n = sc.nextInt();
	            if (n == '0') {
	                break;
	            }
	 
	        }
	 
	}
	    }
	


